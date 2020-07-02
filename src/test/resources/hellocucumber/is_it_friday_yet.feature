Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Background:
    Given I have a bowl for ice cream

  Scenario: Thursday isn't Friday
    Given today is Thursday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
    But I should not have ice cream in my bowl

  Scenario: Friday is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "TGIF"
    And I should have ice cream in my bowl



  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |
