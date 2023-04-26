Feature: Feature to test add to cart and remove from cart

  Scenario: Adding item to cart 
    Given User has already navigated to the product webpage
    Then user selects size and color
    And click Add to Cart button
    Then close the browser
    
  Scenario: Removing item from cart
    Given User navigates to the cart page
    Then click on delete button
    And close the  browser
   

  