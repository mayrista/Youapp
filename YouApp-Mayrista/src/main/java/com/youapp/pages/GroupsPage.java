package com.youapp.pages;

import com.youapp.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class GroupsPage {
    private WebDriver driver;
    public GroupsPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "headlessui-tabs-tab-:rl:")
    private WebElement discover;
    @FindBy(id = "headlessui-tabs-tab-:rm:")
    private WebElement searchGroup;
    @FindBy(xpath = "//section[1]//div[@class='swiper-slide swiper-slide-active']//img[1]")
    private WebElement groupSuggest1;
    @FindBy(xpath = "//div[contains(@class,'swiper-slide swiper-slide-next')]//img[contains(@class,'rounded-full aspect-square max-w-[64px] h-[64px] md:max-w-[100px] md:h-[100px] object-cover object-center')]//div[contains(@class,'swiper-slide swiper-slide-next')]//img[contains(@class,'rounded-full aspect-square max-w-[64px] h-[64px] md:max-w-[100px] md:h-[100px] object-cover object-center')]")
    private WebElement groupSuggest2;
    @FindBy(xpath = "//section[1]//div[1]//div[2]//div[1]//div[3]//a[1]//img[1]")
    private WebElement featureGroup1;
    @FindBy(xpath = "//section[2]//div[@class='swiper-slide swiper-slide-active']//img[1]")
    private WebElement featureGroup2;
    @FindBy(xpath = "//div[contains(@class,'swiper-slide swiper-slide-active')]//a[contains(@class,'w-full flex flex-col rounded-[14px] relative h-full border-2 border-white')]//div[1]")
    private WebElement testGroup;
    public void setDiscover(){
        discover.click();
    }
    public void setSearchGroup(){
        searchGroup.click();
    }
    public void setGroupSuggest1(){
        groupSuggest1.click();
        groupSuggest1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setGroupSuggest2(){
        groupSuggest2.click();
        groupSuggest2.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setFeatureGroup1(){
        featureGroup1.click();
        featureGroup1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setFeatureGroup2(){
        featureGroup2.click();
        featureGroup2.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setTestGroup(){
        testGroup.click();
        testGroup.sendKeys(Keys.ALT.ARROW_LEFT);
    }

}
