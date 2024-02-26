package com.youapp.pages;

import com.youapp.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExperiencesPage {
    private WebDriver driver;
    public ExperiencesPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='w-full flex flex-row overflow-x-auto no-scrollbar items-center justify-between gap-2 relative']/img[1]")
    private WebElement featuredExperience1;
    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//div[@class='w-full flex flex-row overflow-x-auto no-scrollbar items-center justify-between gap-2 relative']/img[1]")
    private WebElement featuredExperience2;
    @FindBy(xpath = "//div[@class='swiper-wrapper']/div[3]//div[@class='w-full flex flex-row overflow-x-auto no-scrollbar items-center justify-between gap-2 relative']/img[1]")
    private WebElement efy1;
    @FindBy(xpath = "//div[@class='w-full flex flex-wrap justify-center px-[26px] xl:px-0 gap-8']/div[1]//div[@class='w-full min-w-[58%] flex justify-center flex-col !aspect-square snap-center']/img[1]")
    private WebElement efy2;
    @FindBy(xpath = "//div[@class='w-full flex flex-wrap justify-center px-[26px] xl:px-0 gap-8']/div[1]//span[@class='whitespace-nowrap text-gradient-main-gold']")
    private WebElement booknow;
    public void setFeaturedExperience1(){
        featuredExperience1.click();
        featuredExperience1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setFeaturedExperience2(){
        featuredExperience2.click();
        featuredExperience2.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setEfy1(){
        efy1.click();
        efy1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setEfy2(){
        efy2.click();
        efy1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setBooknow(){
        booknow.click();
    }
}
