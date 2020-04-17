Feature: Refreshing my Java Cucumber with selenium and api

 @gui
 Scenario: Create a new user
   Given I am on the signup page
   When I complete the signup form with unique details and press submit
   Then a new account is logged in

@api
Scenario: Post a new article
  Given I am a new user and I create a new account
  When I post an article
  Then The post is available in the global feed