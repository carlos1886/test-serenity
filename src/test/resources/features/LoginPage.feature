Feature: Login to serenity Application and validate Login

  Background:
    Given User is on HRMLogin page "https://demo.serenity.is/"

  @ValidCredentials
  Scenario: Login with valid credentials

    When User enters username as "admin" and password as "serenity"
    Then User should be on "Dashboard" page

  @InvalidCredentials
  Scenario Outline: Login with Usuario o contraseña invalido!

    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples:
      | username | password  | errorMessage                   |
      | Admin    | admin12$$ | Usuario o contraseña invalido! |
      | admin$$  | admin123  | Usuario o contraseña invalido! |
      | abc123   | xyz$$     | Usuario o contraseña invalido! |
      | $$$$$$   | %%%%%     | Usuario o contraseña invalido! |

  @MissingUsername @FailedTest
  Scenario: Verify error message when username is missing

    When User enters username as "" and password as "admin123"
    Then User should be able to see error message for empty username as "Por favor, validar entradas vacías o no válidas (marcadas con rojo) antes de enviar el formulario."
