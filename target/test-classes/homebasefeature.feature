@feature1
Feature: To validate udemy app login credentials

   
Scenario Outline: to validate hombase login with invalid user id
  Given to launch the browser
    When to launch url of homebase
    And to click sign in option
    And to give invalid user "<userid>"id
    And to give invalid "<pass>"password
    And to click the sign in button

    Examples: 
      | userid          | pass       |
      | jp@gmail.com    | 5575764764 |
      | 12456@gmail.com | rainattt&& |