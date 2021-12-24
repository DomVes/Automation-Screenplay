Feature: HU-001 Buscador
  Yo como usuario de SanAngel
  Quiero buscar un producto en la plataforma
  Para ver el nombre del producto en pantalla

  Scenario Outline: Buscar producto
    Given que me encuentro en la pagina de San Angel
    When busque el producto <NombreProducto>
    Then podre ver <NombreProducto> en pantalla
    Examples:
      |NombreProducto|
      |Amor, amor|
      |Reino de sueños|
      |Universo encantado|
      |Corazón Corazón|
      |Presente|
      |Fantasía del bosque|
      |Deleite|
      |Reino de sueños|



