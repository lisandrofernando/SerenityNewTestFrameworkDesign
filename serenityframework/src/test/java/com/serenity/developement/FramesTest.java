package com.serenity.developement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class FramesTest {
    
    @Managed
    WebDriver driver;

    @Steps
    FramesPageObject frame;

    @Test
    public void initateTestFrames(){
        frame.openFrameURL();
        frame.switchToFrame();
    }

}
