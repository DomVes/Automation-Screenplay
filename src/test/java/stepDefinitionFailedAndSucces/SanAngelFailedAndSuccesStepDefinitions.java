package stepDefinitionFailedAndSucces;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;
import org.openqa.selenium.By;
import tasks.BuscarProducto;

public class SanAngelFailedAndSuccesStepDefinitions {

    Actor actor = new Actor("Esteban");

    @Given("^ingreso a la pagina$")
    public void ingreso_a_la_pagina() {
        actor.can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.mercadolibre.com.co/")));
    }


    @Given("^busca el producto Presente en la Web$")
    public void busca_el_producto_Presente_en_la_Web() throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel("Presente"));
    }

    @Then("^debe verse Presente en la pantalla de la pagina$")
    public void debe_verse_Presente_en_la_pantalla_de_la_pagina() {

    }

    @Given("^busca el producto Deleite en la Web$")
    public void busca_el_producto_Deleite_en_la_Web() throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel("Deleite"));
    }

    @Then("^debe verse Deleite en la pantalla$")
    public void debe_verse_Deleite_en_la_pantalla() {
        Assert.assertEquals("Presente",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();
    }
}
