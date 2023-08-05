Feature: Login


@Sanity
Scenario: login into nopcommerce

Given user launch chrome browser
When user opens url "https://admin-demo.nopcommerce.com/"
And user enters  email as "admin@yourstore.com" and password as "admin"
And Click on login 
Then  Page Title should be "Dashboard / nopCommerce administration"
When user click on logout link
Then the title of page is "Your store. Login"
And Close the Browser

@Reggression
Scenario Outline: Login with different Crendentials

Given user launch chrome browser
When user opens url "https://admin-demo.nopcommerce.com/"
And user enters  email as "<emailid>" and password as "<password>"
And Click on login 
Then  Page Title should be "Dashboard / nopCommerce administration"
When user click on logout link
Then the title of page is "Your store. Login"
And Close the Browser

Examples: 

  |emailid|password|
  |admin@yourstore.com|admin|
  |admin23@yourstore.com|admin|
