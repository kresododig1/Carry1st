@smoke @regression
Feature: Carry1st Sign In with email and password

@wip
  Scenario Outline: Negative Sign In scenario with 10 incorrect credentials
    Given user is on home page of Carry1st web application
    When user clicks on Sign In button
    And user clicks CONTINUE WITH EMAIL button
    And user enters "<wrongEmail>" and "<wrongPassword>" and clicks SIGN IN button
    Then user should see following message "<errorMessage>"


    Examples:

      | wrongEmail                       | wrongPassword    | errorMessage                           |
      | leana.von@yahoo.com              | 15as50wnkac      | Firebase: Error (auth/user-not-found). |
      | miniva.johnson@gmail.com         | kk88byfvjd0d7    | Firebase: Error (auth/user-not-found). |
      | morgan.ruecker@gmail.com         | rtas50wnkac      | Firebase: Error (auth/user-not-found). |
      | kerry.gerhold@yahoo.com          | Ztfdbyfvjd0d7    | Firebase: Error (auth/user-not-found). |
      | olimpia.hahn@yahoo.com           | fT50wnkac        | Firebase: Error (auth/user-not-found). |
      | domingo.kshlerin@gmail.com       | Ckk88byhjhd7     | Firebase: Error (auth/user-not-found). |
      | evangelina.marquardt@hotmail.com | rTew7r16btrffkqr | Firebase: Error (auth/user-not-found). |
      | eura.steuber@hotmail.com         | SSfnw7r16bhjkkhr | Firebase: Error (auth/user-not-found). |
      | veras.tzona@hotmail.com          | 4fnw7r16fghkqr   | Firebase: Error (auth/user-not-found). |
      | andy.cole@hotmail.com            | ertr16btggqr     | Firebase: Error (auth/user-not-found). |

