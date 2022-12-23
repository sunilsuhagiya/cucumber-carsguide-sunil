Feature: Search functionality


  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Search Cars link
    Then I navigate to "New & Used Car Search - carsguide" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make       | model       | location       | price    |
      | Alfa Romeo | Any Model   | ACT - All      | $200,000 |
      | Audi       | A4          | NSW - All      | $150,000 |
      | BMW        | 1 Series    | NSW - Sydney   | $100,000 |
      | Isuzu      | D-Max       | NT - All       | $90,000  |
      | Holden     | Astra       | QLD - All      | $80,000  |
      | Honda      | Accord Euro | QLD - Brisbane | $70,000  |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Used link
    Then I navigate to Page "Used Cars For Sale"
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model     | location       | price    |
      | Mazda         | 3         | QLD - Brisbane | $150,000 |
      | Mercedes-Benz | C-Class   | NSW - All      | $200,000 |
      | Nissan        | Navara    | VIC - All      | $100,000 |
      | Toyota        | Camry     | VIC - All      | $90,000  |
      | Mitsubishi    | Outlander | NSW - All      | $200,000 |
      | Land Rover    | Discovery | QLD - Brisbane | $200,000 |


  Scenario: Find the dealers and verify the dealers are in list
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Find a Dealer
    Then I navigate to "car-dealers" dealer page
    And I should see the dealer names "<dealersName>" are display on page
      | dealersName                 |
      | 3 Point Motors Epping       |
      | 4WD & Commercial Centre     |
      | 5 Star Auto Trade           |
      | 101 Auto Centre             |
      | A1 Motors Company Glenorchy |
      | ANDREA MOTORI SERVICE       |
      | ABC Motors                  |