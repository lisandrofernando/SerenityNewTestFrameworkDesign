package com.serenity.developement;

import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class Productlist extends PageObject {

public List<String> titles(){
    return findAll(".inventory_item_name").textContents();
}

public void openProductDetailsFor(String itemName) {
    find(By.linkText(itemName)).click();
}
    
}
