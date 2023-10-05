package com.serenity.developement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class FramesPageObject extends UIInteractionSteps{
   
public void openFrameURL(){

            openUrl("http://jqueryui.com/droppable/");

           }

public void switchToFrame(){

    getDriver().switchTo().frame(0);
    //getDriver().switchTo().frame(getDriver().findElement(By.cssSelector("iframe[class='demo-frame']")));
    find("#draggable").click();   
    // try {
    //     Thread.sleep(5000);
    // } catch (InterruptedException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }  
    // Actions act = new Actions(getDriver());
    // WebElement source = find("#draggable");
    // WebElement target = find("#dropable");
    // act.dragAndDrop(source, target).build().perform();
    }
}
