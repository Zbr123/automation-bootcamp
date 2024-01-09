Feature: Form Submission
  A user should be able fill out the practice form with my personal details to ensure the form is functioning correctly.


  @smoke @regression @login
  Scenario: Filling out the practice form with personal details
    Given user is on practice form page
    When  user clicks on the practice form link
    And user enters the first name "Zubair"
    And user enters the last name "Alam"
    And user enters the email address "zubair@co-ventech.com"
    And user enters the phone number "03042132131"

   @regression  @signup @smoke
  Scenario Outline: Filling out the practice form with personal details
    Given user is on practice form page
    And user enters the first name "<first_name>"
    When user clicks on the practice form link
    And user enters the last name "<last_name>"
    And user enters the email address "<email>"
    And user enters the phone number "<phone>"

     Examples:
      | first_name | last_name | email                    | phone       |
      | Zubair     | Alam      | zubair@co-ventech.com    | 03042132131 |
      | Alice      | Smith     | alice.smith@example.com  | 0123456789  |
      | Bob        | Johnson   | bob.johnson@example.com  | 9876543210  |
