package stepDefinitionBackGround;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;
import org.openqa.selenium.By;
import tasks.BuscarProducto;




public class BackgroundStepDefinitions {
    Actor actor = new Actor("Esteban");

    @Given("^que me encuentro en la pagina de SA$")
    public void que_me_encuentro_en_la_pagina_de_SA() {
        actor.can(BrowseTheWeb.with(GoogleChromeDriver.chromeHisBrowserWeb().on("https://www.mercadolibre.com.co/")));
    }

    @Given("^busca Presente en la Web$")
    public void busca_Presente_en_la_Web() throws InterruptedException {

        actor.attemptsTo(BuscarProducto.enSanAngel("Presente"));

    }
    @Then("^debe ver Presente en la pantalla$")
    public void debe_ver_Presente_en_la_pantalla(String producto){

        Assert.assertEquals("Presente",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();

    }

    @Given("^busca Deleite en la Web$")
    public void busca_Deleite_en_la_Web()  {
        actor.attemptsTo(BuscarProducto.enSanAngel("Deleite"));
    }

    @Then("^debe ver Deleite en la pantalla$")
    public void debe_ver_Deleite_en_la_pantalla(){

        Assert.assertEquals("Deleite",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();


    }
    @Given("^busca Reino de sueños en la Web$")
    public void buscaReinoDeSueñosEnLaWeb() throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel("Reino de sueños"));
    }

    @Then("^debe ver Reino de sueños en la pantalla$")
    public void debeVerReinoDeSueñosEnLaPantalla() {
        Assert.assertEquals("Reino de sueños",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();

    }

    @Given("^busca Fantasía del bosque en la Web$")
    public void buscaFantasíaDelBosqueEnLaWeb() throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel("Fantasia del bosque"));

    }

    @Then("^debe ver Fantasía del bosque en la pantalla$")
    public void debeVerFantasíaDelBosqueEnLaPantalla() {
        Assert.assertEquals("Fantasía del bosque",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();

    }

    @Given("^busca Universo encantado en la Web$")
    public void buscaUniversoEncantadoEnLaWeb() throws InterruptedException {
        actor.attemptsTo(BuscarProducto.enSanAngel("Universo encantado"));

    }

    @Then("^debe ver Universo encantado en la pantalla$")
    public void debeVerUniversoEncantadoEnLaPantalla() {

        Assert.assertEquals("Universo encantado",GoogleChromeDriver.driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText());
        GoogleChromeDriver.driver.quit();

    }


}
