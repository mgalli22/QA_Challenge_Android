Feature: Testing Android App

  Scenario Outline: As a user log in to the application correctly
    Given the user is at the login screen
    When the user enters their "<username>" and "<password>" and press login button
    Then the user should see the home screen

    Examples:
    |username            |password
    |prueba@accenture.com|123456
    |Test@accenture.com  |123456
