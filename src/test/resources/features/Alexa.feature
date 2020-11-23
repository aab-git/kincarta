Feature: SearchForAlexa

  Scenario: Item available for purchase

  Given the user navigates to "amazon" homepage
    And the user searches for "Alexa"
    And the user navigates to the second page
    And the user selects the third item
    Then assert that the user would be able to add item to the cart