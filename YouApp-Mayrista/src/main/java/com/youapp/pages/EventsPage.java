package com.youapp.pages;

import com.youapp.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class EventsPage {
    private WebDriver driver;
    public EventsPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='w-full flex flex-wrap justify-center px-[26px] xl:px-0 gap-8']/div[1]//span[@class='whitespace-nowrap text-gradient-main-gold']")
    private WebElement htw1;
    @FindBy(xpath = "//div[@class='w-full  flex flex-col gap-4']//div[1]/div[@class='swiper swiper-initialized swiper-horizontal swiper-pointer-events swiper-free-mode w-full relative h-full']//div[@class='swiper-slide swiper-slide-next']/a[1]/img[1]")
    private WebElement htw2;
    @FindBy(xpath = "div[@class='swiper swiper-initialized swiper-horizontal swiper-pointer-events swiper-free-mode w-full relative h-full swiper-backface-hidden']//div[@class='swiper-slide swiper-slide-active']/a[1]/img[1]")
    private WebElement featureEvent;
    @FindBy(id = "headlessui-tabs-tab-:rh:")
    private WebElement discover;
    @FindBy(id = "headlessui-tabs-tab-:ri:")
    private WebElement searchEvents;
    @FindBy(id = "headlessui-tabs-panel-:rk:")
    private WebElement events;
    public void setHtw1(){
        htw1.click();
        htw1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setHtw2(){
        htw2.click();
        htw2.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setFeatureEvent(){
        featureEvent.click();
        featureEvent.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setDiscover(){
        discover.click();
    }
    public void setSearchEvents(){
        searchEvents.click();
    }
    public void setEvents(){
        events.click();
        events.sendKeys(Keys.ALT.ARROW_LEFT);
    }
}
