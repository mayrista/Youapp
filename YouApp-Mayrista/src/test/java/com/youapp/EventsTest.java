package com.youapp;

import com.youapp.drivers.DriverSingleton;
import com.youapp.pages.CommunitiesPage;
import com.youapp.pages.EventsPage;
import com.youapp.pages.GlobalElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.youapp.utils.Constant.*;

public class EventsTest {
    EventsPage eventsPage;
    GlobalElement globalElement;
    WebDriver driver;
    @BeforeClass
    public void testSetUpEnvironmentChrome(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(URLEVENTS);
        eventsPage = new EventsPage();
        globalElement = new GlobalElement();
    }
    @Test(priority = 1)
    public void testDiscover(){
        eventsPage.setDiscover();
        eventsPage.setHtw1();
        eventsPage.setHtw2();
        eventsPage.setFeatureEvent();
    }
    @Test(dependsOnMethods = "testDiscover")
    public void testSearchEvents(){
        eventsPage.setSearchEvents();
        globalElement.setSearchKeyword("Osaka");
        globalElement.setDate("07 - 07 Feb'24");
        globalElement.setNearme();
        globalElement.setPrice();
        globalElement.setPreferences();
        globalElement.setApply();
        globalElement.setReset();
    }
}
