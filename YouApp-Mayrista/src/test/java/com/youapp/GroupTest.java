package com.youapp;

import com.youapp.drivers.DriverSingleton;
import com.youapp.pages.CommunitiesPage;
import com.youapp.pages.GlobalElement;
import com.youapp.pages.GroupsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.youapp.utils.Constant.URLCOMMUNITIES;
import static com.youapp.utils.Constant.URLGROUPS;

public class GroupTest {
    GroupsPage groupsPage;
    GlobalElement globalElement;
    WebDriver driver;
    @BeforeClass
    public void testSetUpEnvironmentChrome(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(URLGROUPS);
        groupsPage = new GroupsPage();
        globalElement = new GlobalElement();
    }
    @Test(priority = 1)
    public void testDiscoverPage(){
        groupsPage.setDiscover();
        groupsPage.setGroupSuggest1();
        groupsPage.setGroupSuggest2();
        groupsPage.setFeatureGroup1();
        groupsPage.setFeatureGroup2();
    }
    @Test(dependsOnMethods = "testDiscoverPage")
    public void testSearchGroupPage(){
        groupsPage.setSearchGroup();
        globalElement.setSearchKeyword("Osaka");
        globalElement.setDate("07 - 07 Feb'24");
        globalElement.setNearme();
        globalElement.setPrice();
        globalElement.setPreferences();
        globalElement.setReset();
        groupsPage.setTestGroup();
        globalElement.setApply();
    }
}
