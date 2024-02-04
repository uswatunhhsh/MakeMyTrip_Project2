package org.example;

import org.example.Pages.Country;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Country_Test extends BaseTest{

    @Test
    public void selectCountry() {
        Country negara = new Country(driver);

        negara.setClickCountry();
        negara.setSelectCountry();
        negara.getUSA();
        negara.getButtonApply();
        String usa = negara.getResultCountry();
        Assert.assertTrue(usa.contains("USA"));

        negara.setClickCountry();
        negara.setSelectCountry();
        negara.getUAE();
        negara.getButtonApply();
        String uae = negara.getResultCountry();
        Assert.assertTrue(uae.contains("UAE"));


        negara.setClickCountry();
        negara.setSelectCountry();
        negara.getIndia();
        negara.getButtonApply();
        String in = negara.getResultCountry();
        Assert.assertTrue(in.contains("IN"));


    }
}
