Feature: HU-003 Buscador


  Background:
    Given ingreso a la pagina

  Scenario: Buscar las flores Presente en la web
    And busca el producto Presente en la Web
    Then debe verse Presente en la pantalla de la pagina

  Scenario: Busca las flores Deleite en la web
    And busca el producto Deleite en la Web
    Then debe verse Deleite en la pantalla

