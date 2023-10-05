package com.serenity.developement;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;



@RunWith(SerenityRunner.class)
public class ViewProducts {

     @Managed
    WebDriver driver;

     @Steps
    LoginActions login;

    InventoryPage inventory;

    Productlist list;

    ProductDetails details;

    @Test
    public void checkInventoryProducts(){

       login.as(User.STANDARD_USER);
       String Title = inventory.getPageTitle();
       Title.equalsIgnoreCase("Products");

       List<String> productDisplay = list.titles();
       productDisplay.contains("Sauce Labs Bike Light");
       productDisplay.stream().forEach(S->System.out.println(S));
    }

    @Test
    public void shouldDisplayCorrectProductName(){
       login.as(User.STANDARD_USER);
       String Title = inventory.getPageTitle();
       Title.equalsIgnoreCase("Products");
       String item = list.titles().get(1);
       System.out.println("The item is here " +item);
    //    list.openProductDetailsFor(item);
    //    details.productName().equals(item);
    //details.productImangealtValueOf(item).shouldBeCurrentlyVisible();
      
    }

     @Test
    public void highlightDisplayedProducts(){
       login.as(User.STANDARD_USER);
       String Title = inventory.getPageTitle();
       Title.equalsIgnoreCase("Products");
       List<String> productDisplay = list.titles();
       //productDisplay.forEach(productName -> );
       
      
    }
    
}
