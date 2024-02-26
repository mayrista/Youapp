package com.youapp;

import com.youapp.drivers.DriverSingleton;
import com.youapp.pages.CommunitiesPage;
import com.youapp.pages.ExperiencesPage;
import com.youapp.pages.GlobalElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.youapp.utils.Constant.URLCOMMUNITIES;
import static com.youapp.utils.Constant.URLEXPERIENCES;

public class ExperiencesTest {
    ExperiencesPage experiencesPage;
    GlobalElement globalElement;
    WebDriver driver;
    @BeforeClass
    public void testSetUpEnvironmentChrome(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(URLEXPERIENCES);
        experiencesPage = new ExperiencesPage();
        globalElement = new GlobalElement();
    }
    @Test(priority = 1)
    public void experiencesTest(){
        globalElement.setSearchKeyword("Osaka");
        globalElement.setDate("07 - 07 Feb'24");
        globalElement.setNearme();
        globalElement.setPrice();
        globalElement.setPreferences();
        globalElement.setReset();
    }
    @Test(dependsOnMethods = "experiencesTest")
    public void featuredTest(){
        experiencesPage.setFeaturedExperience1();
        experiencesPage.setFeaturedExperience2();
        experiencesPage.setEfy1();
        experiencesPage.setEfy2();
        experiencesPage.setBooknow();
    }
}
