package com.serenity.developement;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginActions extends UIInteractionSteps{

    public void as(User user) {

        openUrl("https://www.saucedemo.com/v1/");
        
        find("[data-test='username']").sendKeys(user.getUsername());
       
        find("[data-test='password']").sendKeys(user.getPassword());
        
        find(".btn_action").click();
    }
    

    
}
