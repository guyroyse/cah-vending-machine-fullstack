Feature: Accepts Coins

  Scenario: No coins are inserted in the machine
    Given I am on the Vending Machine Page
    Then The display shows INSERT COIN
    And The coin return has no coins

  Scenario: Inserting valid coins
    Given I am on the Vending Machine Page
    When I insert a NICKEL
    And I insert a DIME
    And I insert a QUARTER
    Then The display shows 0.40
    And The coin return has no coins

#  Scenario: Inserting invalid coins
#    Given I am on the Vending Machine Page
#    When I insert an invalid coin
#    Then The display shows INSERT COIN
#    And The coin return has the invalid coin
