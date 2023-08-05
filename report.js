$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "the  below steps are common for all scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_clicks_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Customers Menu item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_clicks_on_Customers_Menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search customer using firstname and lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "Enter the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.enter_the_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the lastName",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.enter_the_lastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should found fistname and lastname in search table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.user_should_found_fistname_and_lastname_in_search_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat StepDefinitions.LoginTestStep001.user_should_found_fistname_and_lastname_in_search_table(LoginTestStep001.java:207)\r\n\tat ✽.user should found fistname and lastname in search table(file:///C:/Users/JYO/eclipse-workspace/CucumberProject/./Features/Customer.feature:38)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginTestStep001.close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
});