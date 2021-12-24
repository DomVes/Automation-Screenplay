Feature: HU-002 Buscador


  Background:

    Given que me encuentro en la pagina de SA

  Scenario: Busca flores1 en la web
    And busca Presente en la Web
    Then debe ver Presente en la pantalla

  Scenario: Busca flores2 en la web
    And busca Deleite en la Web
    Then debe ver Deleite en la pantalla

  Scenario: Busca flores3 en la web
    And busca Reino de sueños en la Web
    Then debe ver Reino de sueños en la pantalla

  Scenario: Busca flores4 en la web
    And busca Fantasía del bosque en la Web
    Then debe ver Fantasía del bosque en la pantalla

  Scenario: Busca flores5 en la web
    And busca Universo encantado en la Web
    Then debe ver Universo encantado en la pantalla




