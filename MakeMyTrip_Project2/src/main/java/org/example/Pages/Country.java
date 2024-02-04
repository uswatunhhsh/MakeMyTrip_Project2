package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Country extends org.example.Pages.BasePage {

    public Country(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@data-cy='LanguageSwitcherWidget']")
    WebElement clickCountry;

    @FindBy(xpath = "//p[@data-cy='selectCountry']")
    WebElement selectCountry;

    @FindBy(xpath = "//p[@data-cy='GeographySections_24'][3]")
    WebElement USA;

    @FindBy(xpath = "//p[@data-cy='GeographySections_24'][2]")
    WebElement UAE;

    @FindBy(xpath = "//p[@data-cy='GeographySections_24'][1]")
    WebElement India;

    @FindBy(xpath = "//button[@data-cy='GeographySwitcher_27']")
    WebElement buttonApply;

    @FindBy(xpath = "//span[@class='latoBold capText font11']")
    WebElement resultCountry;

    public void setClickCountry() {
        Country Country = new Country(driver);
        clickCountry.click();
    }

    public void setSelectCountry(){
        selectCountry.click();
        delay(3000);
    }

    public void getUSA(){
        USA.click();
    }

    public void getUAE(){
        UAE.click();
    }

    public void getIndia(){
        India.click();
    }

    public void getButtonApply(){
        buttonApply.click();
        delay(3000);
    }

    public String getResultCountry(){
        return resultCountry.getText();
    }
}
