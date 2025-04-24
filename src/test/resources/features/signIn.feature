@smoke @regression
Feature: Carry1st Sign In with email and password

  @wip
  Scenario Outline: Negative Sign In scenario with 3 incorrect credentials
    Given user is on home page of Carry1st web application
    When user clicks on Sign In button
    And user clicks CONTINUE WITH EMAIL button
    And user enters "<wrongEmail>" and "<wrongPassword>" and clicks SIGN IN button
    Then user should see following message "<errorMessage>"


    Examples:

      | wrongEmail                       | wrongPassword    | errorMessage                                                                        |
      | leana.von@yahoo.com              | 15as50wnkac      | Failed to verify Captcha, please retry or refresh the page if the problem persists. |
      | miniva.johnson@gmail.com         | kk88byfvjd0d7    | Failed to verify Captcha, please retry or refresh the page if the problem persists. |
      | morgan.ruecker@gmail.com         | rtas50wnkac      | Failed to verify Captcha, please retry or refresh the page if the problem persists. |


