@getir_test
Feature: Getir App Functionality Test

  Scenario: Getir App Checked Add to Basket and Clear to Basket
    Given I am on the login page
    And I type email "hello@getir.com"
    And I type password "hello"
    When I click login button
    Then I shown categories page
    When I click "Kişisel Bakım" category
    Then I shown "Kişisel Bakım" products page
    And I click "Sabun" product
    And I click basket button
    And I validate "Sabun" check in basket
    When I click back button
    Then I shown "Kişisel Bakım" products page
    When I click back button
    Then I shown categories page
    When I click "Ev Bakımı" category
    Then I shown "Ev Bakımı" products page
    And I click "Deterjan" product
    And I click basket button
    And I validate "Deterjan" check in basket
    And I delete product in basket
    And I delete product in basket
    And I check that the basket is empty





