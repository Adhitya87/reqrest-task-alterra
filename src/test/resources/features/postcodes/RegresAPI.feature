Feature: Reqres API


  @createUser
  Scenario: Create user
    When I create new User with name is "Fifeka" and job is "Quality Assurance"
    Then New user is created
    And New user name is "Fifeka" and job is "Quality Assurance"

  @register
  Scenario: as a new user, I need to register myself as a new user to site
    When user input with email is "eve.holt@reqres.in" and password is "pistol"
    Then user successes register
    And user id is 4 and token "QpwL5tke4Pnpja7X4"