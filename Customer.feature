Feature: Customer

 Background: the  below steps are common for all scenarios
 
Given user launch chrome browser
When user opens url "https://admin-demo.nopcommerce.com/"
And user enters  email as "admin@yourstore.com" and password as "admin"
And Click on login 
Then  User can view Dashboard
When User clicks on Customers Menu
And User clicks on Customers Menu item
 
@Regression
Scenario: login into newnopcustomer

And user clicks on AddNew button
Then user can view add new customer page
When Customer enter customer info 
And User clicks  on save btton
Then user can view confirmation message "The new customer has been added successfully"
And Close the Browser


@Regression
Scenario: search the customer using Email

And Enter the customer email
And user clicks on search button
Then User shoud found email in search table
And Close the Browser

@Sanity
Scenario: search customer using firstname and lastname

And Enter the firstname
And Enter the lastName
And user clicks on search button
Then user should found fistname and lastname in search table
And Close the Browser



