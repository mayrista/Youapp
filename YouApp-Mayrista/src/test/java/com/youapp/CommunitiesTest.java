package com.youapp;

import com.youapp.drivers.DriverSingleton;
import com.youapp.pages.CommunitiesPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.youapp.utils.Constant.URLCOMMUNITIES;

public class CommunitiesTest {
    CommunitiesPage communitiesPage;
    WebDriver driver;
    @BeforeClass
    public void testSetUpEnvironmentChrome(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(URLCOMMUNITIES);
        communitiesPage = new CommunitiesPage();
    }
    @Test(priority = 1)
    public void testDiscoverPage(){
        communitiesPage.setDiscover();
        communitiesPage.setCompleteProfile();
        communitiesPage.setFoodies();
        communitiesPage.setMalaysiaTruly();
        communitiesPage.setSingapore();
        communitiesPage.setOsaka();
        communitiesPage.setCommunity1();
        communitiesPage.setCommunity2();
        communitiesPage.setCommunity3();
    }
    @Test(dependsOnMethods = "testDiscoverPage")
    public void profileTest(){
        communitiesPage.setSearchCommunityProfile();
        communitiesPage.setFeeds();
        communitiesPage.setMedia();
        communitiesPage.setMenuItemSelect("ALL");
        communitiesPage.setMediaPicture();
        communitiesPage.setMember();
        communitiesPage.setJoinNow();
    }
}
