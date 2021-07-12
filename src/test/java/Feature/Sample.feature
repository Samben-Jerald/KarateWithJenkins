
@Sample
Feature: This is a sample feature
  
  Scenario: To check this api is gives response
  Given url 'https://reqres.in/api/users?page=2'
  Then method get
  And status 200
    
  
