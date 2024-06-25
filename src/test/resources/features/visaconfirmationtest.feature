Feature: Visa Confirmation Feature

#  1.anAustralianCominToUKForTourism.
#  Click on start button
#  Select a Nationality 'Australia'
#  Click on Continue button
#  Select reason 'Tourism'
#  Click on Continue button
#  verify result 'You will not need a visa to come to the UK'

  @author_Yatri @smoke @regression
  Scenario: Verify Australian coming to UK for tourism
    Given I am on homepage
    When I accept cookie
    And  I click on start button
    And I select nationality "Australia"
    And I click on continue button
    And I select reason Tourism "Tourism"
    And I click on continue next button
    Then I should verify text "You will not need a visa to come to the UK"


#  2.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
#  Click on start button
#  Select a Nationality 'Chile'
#  Click on Continue button
#  Select reason 'Work, academic visit or business'
#  Click on Continue button
#  Select intendent to stay for 'longer than 6 months'
#  Click on Continue button
#  Select have planning to work for 'Health and care professional'
#  Click on Continue button
#  verify result 'You need a visa to work in health and care'

  @author_Yatri @sanity @regression
  Scenario: a Chilean Coming To The UK For Work And Plans On Staying For Longer Than SixMonths
    Given I am on homepage
    When I accept cookie
    And I click on start button
    And I select nationality "Chile"
    And I click on continue button
    And I select Work academic visit or business
    And I click on continue next button
    And I select stay for longer than six months
    And I click on continue next button
    And I select planning to work for Health and care professional
    And I Click on Continue button for HealthAndCare
    Then I should verify result "You need a visa to work in health and care"

#  3.aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card

#  Click on start button
#  Select a Nationality 'Colombia'
#  Click on Continue button
#  Select reason 'Join partner or family for a long stay'
#  Click on Continue button
#  Select state My partner of family member have uk immigration status 'yes'
#  Click on Continue button
#  verify result 'You’ll need a visa to join your family or partner in the UK'

  @author_Yatri @smoke @sanity @regression
  Scenario: a Columbian National Coming To The UK To Join A Partner For A LongStay They Do Have An Article10Or20Card
    Given I am on homepage
    When I accept cookie
    And I click on start button
    And I select a Nationality "Colombia"
    And I click on continue button
    And I select reason Join partner or family for a long stay
    And I click on continue button for reasons for travelling
    Then I should verify a result "You’ll need a visa to join your family or partner in the UK"











