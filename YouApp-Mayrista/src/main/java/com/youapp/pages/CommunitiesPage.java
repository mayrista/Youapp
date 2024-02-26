package com.youapp.pages;

import com.youapp.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunitiesPage {
    private WebDriver driver;
    public CommunitiesPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='px-2 capitalize'][normalize-space()='Communities']")
    private WebElement clickComunities;
    @FindBy(id = "headlessui-tabs-tab-:r5:")
    private WebElement discover;
    @FindBy(xpath = "//span[.='Complete Profile']")
    private WebElement completeProfile;
    @FindBy(xpath = "//a[@href='/community/foodies?']//img")
    private WebElement foodies;
    @FindBy(xpath = "//a[@href='/community/malaysia-truly-asia?']//img")
    private WebElement malaysiaTruly;
    @FindBy(xpath = "//a[@href='/community/singapore-the-lion-city?']//img")
    private WebElement singapore;
    @FindBy(xpath = "//a[@href='/community/osaka?']//img")
    private WebElement osaka;
    @FindBy(xpath = "//*[@id=\"title\"]/div[2]/a[1]")
    private WebElement community1;
    @FindBy(xpath = "//*[@id=\"title\"]/div[2]/a[2]")
    private WebElement community2;
    @FindBy(xpath = "//*[@id=\"title\"]/div[2]/a[3]")
    private WebElement community3;

    //Profile
    @FindBy(xpath = "//div[@class='text-white text-[12px] md:text-[18px] font-medium inline-block whitespace-nowrap']")
    private WebElement searchCommunityProfile;
    @FindBy(id = "headlessui-tabs-tab-:r5:")
    private WebElement feeds;
    @FindBy(id = "headlessui-tabs-tab-:r6:")
    private WebElement media;
    @FindBy(id = "headlessui-menu-button-:r8:")
    private WebElement menuItemSelect;
    @FindBy(xpath = "//div[@class='w-1/3 inset-0 flex flex-col aspect-square p-1 cursor-pointer']/img[1]")
    private WebElement mediaPicture;
    @FindBy(id = "SecondaryDiv")
    private WebElement member;
    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div/a")
    private WebElement joinNow;

    //Search Community
    @FindBy(id = "headlessui-tabs-tab-:r6:")
    private WebElement searchCommunity;

    public void setClickComunities(){
        clickComunities.click();
    }
    public void setDiscover(){
        discover.click();
    }
    public void setCompleteProfile(){
        completeProfile.click();
        foodies.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setFoodies(){
        foodies.click();
        foodies.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setMalaysiaTruly(){
        malaysiaTruly.click();
        malaysiaTruly.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setSingapore(){
        singapore.click();
        singapore.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setOsaka(){
        osaka.click();
        osaka.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setCommunity1(){
        community1.click();
        community1.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setCommunity2(){
        community2.click();
        community2.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setCommunity3(){
        community3.click();
        community3.sendKeys(Keys.ALT.ARROW_LEFT);
    }
    public void setSearchCommunityProfile(){
        searchCommunityProfile.click();
    }
    public void setFeeds(){
        feeds.click();
    }
    public void setMedia(){
        media.click();
    }
    public void setMenuItemSelect(String select){
        menuItemSelect.sendKeys(select);
    }
    public void setMediaPicture(){
        mediaPicture.click();
    }
    public void setMember(){
        member.click();
    }
    public void setJoinNow(){
        joinNow.click();
    }
}