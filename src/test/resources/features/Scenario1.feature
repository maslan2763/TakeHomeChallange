@smoke
Feature: Using Google Translate application

  Background:
    Given user is on the google translation page


    Scenario:
      Given user select the source language
      Then user select the translation language
      Then user enter initial text in the input field
      And expected result is verified correct
      When user click swap languages button
      Then user verify the result
      Then user clear the input field
      Then user select screen keyboard and type Hi!


#      Scenario: click swap languages button and verify the result related to previous scenario
#        Given user select the source language
#        Then user select the translation language
#        Then user enter initial text in the input field
#        And expected result is verified correct
#         When user click swap languages button
#         Then user verify the result
#
#
#
#        Scenario: clearing the input field and using screen keyboard
#          Given user select the source language
#          Then user select the translation language
#          Then user enter initial text in the input field
#          And expected result is verified correct
#          When user click swap languages button
#          Then user verify the result
#          Then user clear the input field
#          Then user select screen keyboard and type Hi!
