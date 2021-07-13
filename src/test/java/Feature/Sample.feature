
@Sample
Feature: This is a sample feature
  
  Scenario: To check this api is gives response
  Given url baseUrl
  Then method get
  And status 200
  
  Scenario: Print name
  Given print name
  Given print clientId
  Given print baseUrl
    
  
