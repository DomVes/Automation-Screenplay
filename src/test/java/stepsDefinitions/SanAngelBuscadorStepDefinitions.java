package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarProducto;
import uis.SanAngelPage;

public class SanAngelBuscadorStepDefinitions {

    Actor actor = new Actor("Esteban");

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^que me encuentro en la pagina de San Angel$")
    public void queMeEncuentroEnLaPaginaDeSanAngel(){
        actor.can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.mercadolibre.com.co/")));
    }

    @When("^busque el producto (.*)$")
    public void busqueElProducto(String producto) throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel(producto));
    }
    @Then("^podre ver (.*) en pantalla$")
    public void podreVerEnPantalla(String producto){
        actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(SanAngelPage.TXT_ELEMENTO_BUSQUEDA.of(producto)), WebElementStateMatchers.containsText(producto.replace("  "," "))));
    }
}



