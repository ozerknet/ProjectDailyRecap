Feature: 1-Get info about yourself
  Scenario Outline: 1-Get info about yourself

    When  user go to link for get info about yourself and take information with valid Token and <response> and <message>

    Examples:
      | response | message                         |
      | "200"    | "User Found"                    |
      | "401"    | "Unauthorized - Login required" |
      | "403"    | "Forbidden - Not authorised"    |