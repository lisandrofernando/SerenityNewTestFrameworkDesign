package com.serenity.developement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;

public class ProductDetails extends PageObject{

    public String productName(){
        return find("inventory_item_name").getText();
    }

    public WebElementState productImangealtValueOf(String item) {

        return find("'.inventory_details_container img[alt='"+item+"']')");
    }
    
}
