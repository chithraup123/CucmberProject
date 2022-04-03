package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	int actualRes;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		System.out.println("Inside Calculator");
	}

	@When("I Add two numbers {int} and {int}")
	public void i_add_two_numbers_and(int num1, int num2) {
		actualRes = num1 + num2;
	}

	@Then("The result should be {int}")
	public void the_result_should_be(int expRes) {
		Assert.assertEquals(expRes, actualRes);
	}

	@When("I Substract two numbers {int} and {int}")
	public void i_substract_two_numbers_and(int num1, int num2) {
		actualRes = num1 - num2;
	}

	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();
		for (int i = 0; i < rows; i++) {
			actualRes = actualRes + Integer.parseInt(dataTable.cell(i, 0));
		}
	}

	@When("order below orders")
	public void order_below_orders(Map<String, Integer> orders) {

		for (String orderItem : orders.keySet()) {
			actualRes = actualRes + orders.get(orderItem);
		}

	}

	@When("I add below numbers using a list")
	public void i_add_below_numbers_using_a_list(List<Integer> numbers) {

		for (Integer num : numbers) {
			actualRes = actualRes + num;
		}
	}

	@When("order below orders with multiple qty")
	public void order_below_orders_with_multiple_qty(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {
			int qty = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i, 2));
			actualRes = actualRes + (qty * price);

		}
	}

}
