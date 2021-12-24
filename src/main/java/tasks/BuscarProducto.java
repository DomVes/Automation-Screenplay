package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.SanAngelPage;



public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(SanAngelPage.TXT_BUSCADOR),
                Click.on(SanAngelPage.BTN_BUSCADOR),
                Click.on(SanAngelPage.BTN_ELEMENTO_BUSQUEDA.of(producto))
        );
    }

    public static BuscarProducto enSanAngel(String producto){
        return Instrumented.instanceOf(BuscarProducto.class).withProperties(producto);
    }
}
