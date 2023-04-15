Feature: Shopee

Scenario: Homepage
Given user launch url

Scenario: User select the product
When user select category from dropdown
And user select the brand and product

Scenario: Selected product to gotocart
And user select the product to addtocart
And user select gotocart