Feature: user go to linkedIn job search webpage

  Scenario: user go to linkedIn job search page

    When user go to linkedIn webpage
    And user click to sign in button
    And user enter username and password
    Then user click to quality assurance text
    And user click Date Posted and select past twenty four hours

