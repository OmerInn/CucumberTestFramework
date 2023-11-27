
Feature: Register Test
  Scenario Outline: Create An Account

    Given Navigate to Website Register
    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type dateOfBirth "<Day>" "<Month>" "<Year>"
    And click on register button
    Examples:
      | Email                     | firstname | lastname | password | Day | Month | Year |
      | dell49@gmail.com       | Joe      | Alexand   | joe123   | 2   | 5     |4 |
      | monster59@gmail.com     | Gina      | Arno     | arno123  | 4   | 6     |5 |
      | asus57@gmail.com        | Lamia     | Chovaron | lam123   | 6   | 8     |5 |