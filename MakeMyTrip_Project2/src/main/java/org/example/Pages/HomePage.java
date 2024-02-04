package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends org.example.Pages.BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.ID, using = "fromCity")
    WebElement fromCityClick;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement fromCitySearch;

    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    WebElement clickSearchFrom;

    @FindBy(id = "fromCity")
    WebElement resultFromCity;

    @FindBy(id = "toCity")
    WebElement toCityClick;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement toCitySearch;

    @FindBy(xpath = "//li[@data-section-index='0']")
    WebElement clickSearchTo;


    @FindBy(xpath = "//div[@aria-label='Wed Feb 14 2024']")
    WebElement clickDateFrom;

    @FindBy(xpath = "//div[@data-cy='returnArea']")
    WebElement clickReturn;

    @FindBy(xpath = "//div[@aria-label='Thu Feb 15 2024']")
    WebElement clickDateTo;

    @FindBy(xpath = "//p[@data-cy='submit']")
    WebElement clickSubmit;

    @FindBy(xpath = "(//input[@id='listingFilterCheckbox'])[5]")
    WebElement clickCheckBox;

    @FindBy(xpath = "//button[@class=\"button buttonSecondry buttonBig fontSize12 relative\"]")
    WebElement clickPopup;

    public void setFromCityClick(String input) {
        fromCityClick.click();
        fromCitySearch.sendKeys(input);
        delay(3000);
        clickSearchFrom.click();
    }
    public String getResultFromCity(){
        String resultFrom = resultFromCity.getAttribute("value");
        return resultFrom;
    }

    public void setToCitySearch(String input) {
        toCityClick.click();
        toCitySearch.sendKeys(input);
        delay(3000);
        clickSearchTo.click();
    }
    public String getResultToCity() {
        String resultTo = toCityClick.getAttribute("value");
        return resultTo;
    }

    public void setDeparture() {
        clickDateFrom.click();
        clickReturn.click();
        delay(1000);
        clickDateTo.click();

    }

    public void submit() {
        clickSubmit.click();
        delay(5000);
    }


    public void ceklisCheckBox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"button buttonSecondry buttonBig fontSize12 relative\"]")));
        clickPopup.click();
        clickCheckBox.click();

    }}