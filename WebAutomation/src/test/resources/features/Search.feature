Feature: Search
  As User
  I want to search anything i want to know in skillacademy web
  So that I can see and find them in this page

  Scenario: Search using correct keyword
    Given User already on skillacademy webpage
    When User input keyword like "Skill"
      And User click search button
    Then User gets the result of keyword entered : "Skill"

#  Scenario: Search using not found keyword
#    Given User already on skillacademy webpage
#    When User input keyword like "bdhjsa"
#      And User click search button
#    Then User gets no result found page