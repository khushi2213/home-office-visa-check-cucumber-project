@regression
Feature: Uk visa Test
  As a user I want to apply visa for Uk


  Background: I am on homepage
    And I click on accept cookies
    And I click on hide message

  @smoke
  Scenario: An australian coming to UK for tourism
    When I click start button
    And I select a nationality 'Australia'
    And I click on Continue button
    And I select reason 'Tourism or visiting family and friends'
    And I click on Continue button again
    Then I verify result 'You will not need a visa to come to the UK'

  @sanity
  Scenario: A chilean coming to the UK for work and plans on staying for longer than six months
    When I click start button
    And I select a nationality 'Chile'
    And I click on Continue button
    And I select reason 'Work, academic visit or business'
    And I click on Continue button
    And I select intendent to stay for 'lessThanSix'
    Then I click on Continue button

  @regression
  Scenario: A columbian national coming to the UK to join a partner for a long stay they do have an article 10 or 20 card
    When I click start button
    And I select a nationality 'Colombia'
    And I click on Continue button
    And I select reason 'Join partner or family for a long stay'
    Then I click on Continue button