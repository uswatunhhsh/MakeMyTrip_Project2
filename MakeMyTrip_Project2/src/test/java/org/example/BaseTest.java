package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;


    @BeforeSuite
    public void globalSetUp() {
        System.out.println("***Test Execution Started***");
    }

    @AfterSuite
    public void globalTearDown() {
        System.out.println(("***Test Execution Finish***"));
    }

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");
    }

    @AfterClass
    public void TearDown() {
        driver.quit();
    }
}

