# RetoFinalScreenplay

En esta ocasion las automatizaciones son realizadas en Cucumber/Screenplay, teniendo en cuenta 3 parametros diferentes para la ejecucion, los cuales serán 3 archivos "Feature" diferentes.

Se detalla a continuacions las actividades a realizar:

- Buscar 5 productos no desde el Excel sino desde el "feature" con examples
- Utilizar un Background para realizar como mínimo 2 escenarios.
- Realizar un escenario fallido y uno exitoso sin examples.

A continuacion una Preview general del códico, carpetas, clases y features creados para este proceso.

![image](https://user-images.githubusercontent.com/95547617/147370593-719dcda1-063e-4af3-9924-ff7b7f63e216.png)


Detallaremos las funciones de cada Clase de la imagen anterior:

En esta clase importamos y creamos los objetos para poder ulitizar el ChromeDriver y sus funciones
parametrizamos las optiones de ejecucion, como lo son el "--star-maximized" y errores es certificados "--ignore-certificate-errors"

![image](https://user-images.githubusercontent.com/95547617/147370599-6b4d51e1-e557-4abb-9086-921e3b2939ce.png)

En esta Clase, del package "uis" vamos a instanciar los elementos tipo "Target" previamebte importados (net.serenitybdd.screenplay.targets.Target) en los cuales definiremos los valores con By.xpath a la barra de busqueda, boton de busqueda y en los get y sets que se visualizan en la parte intefior de la clase, los cuales son para las validaciones que realizaremos más adelante

![image](https://user-images.githubusercontent.com/95547617/147370630-80d93a7a-3a50-4a2a-a2cd-491706ae287e.png)

En este apartado del Package "tasks" definimos los pasos a seguir para la ejecucion y busqueda, la cual pertenece al Feature "SanAngelBuscador.feature"

![image](https://user-images.githubusercontent.com/95547617/147370651-f3d519b3-35ea-43da-bc75-31f5161ba6dd.png)


RUNNERS DE CADA FEATURE

![image](https://user-images.githubusercontent.com/95547617/146702753-96976248-1c46-4613-8a83-66c894d85cbe.png) ![image](https://user-images.githubusercontent.com/95547617/146702761-6c474bc0-ae0d-4323-b4f1-fbef8c681db3.png) ![image](https://user-images.githubusercontent.com/95547617/146702776-81d24e47-ffec-4a7d-ad38-4221b2bf28d5.png)

Este Feature contiene el Scenario Ouline para la busqueda que corresponde a la primera actividad a realizar, alli establecemos los nombres de los productos a buscar justo debajo del "NombreProducto", el cual irá leyendo el Feature a medida que vaya realizando la ejecucion y respectiva validación.

![image](https://user-images.githubusercontent.com/95547617/146702849-d0b748b2-bee6-4c95-b93d-fe22c4fcda65.png)

Aqui creamos los "Given", "When" y  "Then" que corresponden a los establecidos en el Feature anterior, y aqui mismo llamamos los metodos que definimos en el Package "steps", de este modo en el Given abriremos la Web, en el Then realizaremos la busqueda del producto que nos envia el Feature y en el Then validaremos que la busqueda y el resultado coincidan, y asi mismo cerrando la pagina al final de cada busqueda 

![image](https://user-images.githubusercontent.com/95547617/147370668-8bed0dbe-1784-44dc-a858-63c81c83455c.png)

Este Feature pertenece al segundo item el cual nos indica realizar un Background con al menos 2 Scenarios; En este caso lo estamos probando con 5. 

![image](https://user-images.githubusercontent.com/95547617/146703309-b4e29aab-9076-4eb6-8aa7-6b15056cf4bb.png)

Para este Feature creamos el Runner anteriormente enseñado "BackGroundRunner" y su respectivo Package "stepDefinitionBackGround", en el creamos la clase "BackGroundStepDefinitions"; Allí mismo creamos los respectivos "Given", "When" y "Then". Para este caso realizaremos la busqueda directamente sobre los steps para indicar el nombre del producto por cada Scenario recorrido, con su respectiva validacion. 

![image](https://user-images.githubusercontent.com/95547617/147370682-441550ec-99e8-44e8-a45f-1adaa4ad0181.png)
![image](https://user-images.githubusercontent.com/95547617/147370687-23a6d5c3-b3cc-4289-84d8-a7b22735e316.png)


Nuestro ultimo Feature corresponde al punto último , el cual estipula generar dos Scenarios SIN EXAMPLES, uno fallido y otro Exitoso, para estos Creamos asi mismo el Runner "SanAngelFailAnsSuccessRunner" y el Package "stepDefinitionFailedAndSucces" para allí generar la Clase "SanAngelFailedAndSuccesStepDefinitions"; En ella como en el anterior Feature estableceremos las busquedas directamente en los "Given","Then" y las validaciones respectivamente. Para este caso es importante generar el infome de Scenario Fallido y exitoso, el cual explicaremos un par de imagenes más abajo. 
   
![image](https://user-images.githubusercontent.com/95547617/147370692-40f60202-4676-4fcc-91e1-dfda5a6d4a3c.png)

Buscamos la opcion aggregate, la cual esta en la parte Izquierda de nuestro IDE(IntelliJ IDEA 2021.2.3), /Retp01Cucumber/Tasks/serenity bdd/aggregate, clickeamos al finalizar la ejecucion del Runner "SanAngelFailAndSuccessRunner" y luego buscaremos en el directorio principal un archivo con extensión .html el cual se genera despues de que carga el aggregate. 

![image](https://user-images.githubusercontent.com/95547617/146704402-c2360309-a0d1-4bf9-85e0-770ba45b3e45.png)

La ruta de este archivo se ubica en la carpeta Target, la cual se ubica en /Reto01Cucumber/target/site y asi esta en la parte inferior con el nombre "build-info.html"

![image](https://user-images.githubusercontent.com/95547617/146704815-1dcd2c69-e036-4fbc-aa26-e55f293ded01.png)

![image](https://user-images.githubusercontent.com/95547617/146704744-714abfd1-b5cc-40ba-826c-38237e375ba8.png)

Cicleamos sobre este y elegimos el navegador para verlo, en este caso, Chrome.

![image](https://user-images.githubusercontent.com/95547617/146704904-d2b200c6-ec44-4b56-9fd0-06cb5e19f8e0.png)

Aqui veremos el reporte de ambos Scenarios ejecutados, dandonos como resultado, lo esperado: 1 Scenario Passing y otro Failed

![image](https://user-images.githubusercontent.com/95547617/146704985-121b0629-afae-413f-9926-e3ab765993ec.png)

A continuacion están las evidencias de que todos los Features se ejecutan de manera exitosa.

SanAngelRunner

![image](https://user-images.githubusercontent.com/95547617/146705351-ebd4bdd8-7acf-4e96-ae30-1018acc6cdc4.png)

BackGroundRunner

![image](https://user-images.githubusercontent.com/95547617/146705510-ecaf1914-27d8-4cc0-aea6-86803c7398b8.png)

SanAngelFailAndSuccessRunner

![image](https://user-images.githubusercontent.com/95547617/146705625-e8f2baac-ce3a-4faf-b1d0-db2372622b6e.png)


![image](https://user-images.githubusercontent.com/95547617/146705667-700e13f6-508f-4162-884b-775f7298959f.png)




















