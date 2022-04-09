$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "This feature would be used to design the login page of an application",
  "description": "  //multiple Given statements can be given inside the background section",
  "keyword": "Feature"
});
formatter.background({
  "name": "Open the application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have opened the application in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_have_opened_the_application_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Successful login of the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be landed on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_be_landed_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});