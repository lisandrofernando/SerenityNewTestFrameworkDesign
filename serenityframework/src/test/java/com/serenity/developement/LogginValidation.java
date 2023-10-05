package com.serenity.developement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class LogginValidation {


    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventory;

    @Test
    public void userLogginIn(){
       login.as(User.STANDARD_USER);
       String Title = inventory.getPageTitle();
       Title.equalsIgnoreCase("Products");
      
       Serenity.reportThat("The inventory page should be displayed with the correct title", () ->  Title.equalsIgnoreCase("Products")
       );
       
    }
    
}
