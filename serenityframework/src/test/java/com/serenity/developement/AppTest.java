package com.serenity.developement;



import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SerenityRunner.class)
public class AppTest extends UIInteractionSteps {

    

     @Steps
    LoginActions login;
    User user;

    
    @Test
    public void browserStackTest()
    {


        openUrl("https://www.saucedemo.com/v1/");
        
        find("[data-test='username']").sendKeys("standard_user");
       
        find("[data-test='password']").sendKeys("secret_sauce");
        
        find(".btn_action").click();
       
    }
}
