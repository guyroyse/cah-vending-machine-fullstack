Feature: Sample

  Scenario: It doesn't break the Internet
    Given I go to the Google Home page
    When I search for 'google'
    Then The Internet does not break
