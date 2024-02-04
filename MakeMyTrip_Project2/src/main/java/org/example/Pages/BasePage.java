package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        PageFactory.initElements(driver, this);
    }

    public void delay(int wait){
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
