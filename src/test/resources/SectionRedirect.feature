Feature: Section redirect

Scenario: 'Pricing' redirection by toolbar
    Given user is on home page
    When clicks 'Pricing' toolbar button
    Then user is redirected to 'Pricing' section

Scenario: 'Pricing' redirection by toolbar
    Given user is on home page
    When clicks 'Pricing' arrow-drop-down button
    Then user is redirected to 'Pricing' section
