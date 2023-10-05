package com.serenity.developement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class WindPageObject extends UIInteractionSteps{
    

    public void landingPage(){

         openUrl("https://rahulshettyacademy.com/loginpagePractise/#");
    }

  public void SwitchWindows(){
     Set<String> wind = getDriver().getWindowHandles();
     Iterator<String> it = wind.iterator();
     String parentID =  it.next();
     String childID = it.next();
     getDriver().switchTo().window(childID);
     String emailID = find(".im-para.red").getText().split("at")[1].trim().split(" ")[0];
     System.out.println(emailID);
     getDriver().switchTo().window(parentID);
     find(By.id("username")).sendKeys(emailID);

  }
}
