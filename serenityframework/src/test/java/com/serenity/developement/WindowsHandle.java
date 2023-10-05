package com.serenity.developement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.developement.helpers.HelpFunctions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class WindowsHandle {
    
     @Managed
    WebDriver driver;

    @Steps
    WindPageObject childWindow;

    HelpFunctions helper;

    @Test
    public void swithWindow() throws InterruptedException {
        childWindow.landingPage();
        helper.clickElement();
         Thread.sleep(5000);
        childWindow.SwitchWindows();
    }

}
