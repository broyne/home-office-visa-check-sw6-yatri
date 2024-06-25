Feature: Country dropdown Feature

  @author_Yatri @smoke @regression
  Scenario: Verify the following country available in country dropdown list
    Given I am on home page
    When I click on start button
    Then  I can see following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |


