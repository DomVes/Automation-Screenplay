package uis;

import net.serenitybdd.screenplay.targets.Target;

public class SanAngelPage {

    public static final Target TXT_BUSCADOR = Target.the("").locatedBy("//input[@placeholder]");
    public static final Target BTN_BUSCADOR = Target.the("").locatedBy("//div[@class='dgwt-wcas-content-wrapp']");
    public static final Target BTN_ELEMENTO_BUSQUEDA = Target.the("").locatedBy("//a[@class='ui-search-item__group__element ui-search-link']//h2[contains(text(),'{0}')]");
    public static final Target TXT_ELEMENTO_BUSQUEDA = Target.the("").locatedBy("//h1[@class='product_title entry-title']");
}
