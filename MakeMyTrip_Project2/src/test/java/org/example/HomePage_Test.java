package org.example;

import org.example.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_Test extends BaseTest {

        @Test
        public void selectFomCity(){
            String expectedFrom = "Bangkok";
            String expectedTo = "Singapore";

            HomePage home = new HomePage(driver);

            home.setFromCityClick(expectedFrom);
            String actualFrom = home.getResultFromCity();
            Assert.assertEquals(actualFrom, expectedFrom, "Result From");

            home.setToCitySearch(expectedTo);
            String actualTo = home.getResultToCity();
            Assert.assertEquals(actualTo, expectedTo, "Result To");

            home.setDeparture();
            home.submit();
            home.ceklisCheckBox();
        }
    }

