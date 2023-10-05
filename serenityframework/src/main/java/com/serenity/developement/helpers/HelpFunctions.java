package com.serenity.developement.helpers;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class HelpFunctions extends UIInteractionSteps{
    
    public void clickElement(){

        find(".blinkingText").click();
    }
}
