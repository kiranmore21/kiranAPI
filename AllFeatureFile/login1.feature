
    
    Feature: SauceDemo Login page functionality

  Scenario Outline: Test login page with valid credintinals
    Given user is on login page
    When user enters valid credintials "<username>" and "<password>"
    And user clicks on login button
    Then user is on Homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
    