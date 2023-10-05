package com.serenity.developement;

import net.serenitybdd.core.pages.PageObject;

public class InventoryPage extends PageObject{

    public String getPageTitle() {

        return find(".product_label").getText();
    }
    

}
