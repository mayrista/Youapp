package com.youapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalElement {
    @FindBy(xpath = "//div[@class='swiper-button aspect-square w-8 h-8 flex items-center justify-center text-white bg-zinc-800 bg-opacity-40 rounded-full cursor-pointer absolute top-[50%] right-0 z-10 -translate-y-1/2']")
    private WebElement swipeRight;
    @FindBy(xpath = "//div[@class='swiper-button aspect-square w-8 h-8 flex items-center justify-center text-white bg-zinc-800 bg-opacity-40 rounded-full cursor-pointer absolute top-[50%] left-0 z-10 -translate-y-1/2']//*[name()='svg']")
    private WebElement swipeLeft;
    @FindBy(id = "searchKeyword")
    private WebElement searchKeyword;
    @FindBy(xpath = "//span[@class='text-shade-color-50 cursor-pointer text-sm font-normal leading-tight']")
    private WebElement reset;
    @FindBy(id = "headlessui-tabs-panel-:r22:")
    private WebElement preferences;
    @FindBy(id = "newProfession")
    private WebElement profession;
    @FindBy(id = "newPersonalitie")
    private WebElement personalitie;
    @FindBy(id = "newSkill")
    private WebElement skill;
    @FindBy(xpath = "//span[.='Date']")
    private WebElement date;
    @FindBy(xpath = "//span[normalize-space()='Near Me']")
    private WebElement nearme;
    @FindBy(xpath = "//body//main//div[contains(@role,'tabpanel')]//div//div//div//div//div[2]//div[1]//div[4]")
    private WebElement price;
    @FindBy(xpath = "//div[@class=' w-full flex flex-wrap justify-around gap-8 ']/a[1]//div[@class='w-full h-[130px] md:h-[210px] rounded-xl bg-gradient-to-t from-black/80 to-black/10 absolute bottom-0']")
    private WebElement searchcommunity1;
    @FindBy(xpath = "//div[@class=' w-full flex flex-wrap justify-around gap-8 ']/a[2]//div[@class='w-full h-[130px] md:h-[210px] rounded-xl bg-gradient-to-t from-black/80 to-black/10 absolute bottom-0']")
    private WebElement searchCommunity2;
    @FindBy(xpath = "//div[@class='sticky bottom-4 shadow-2xl shadow-black w-full mt-8 h-12 px-7 py-3.5 bg-gradient-main-blue rounded-lg justify-center items-center gap-2 inline-flex cursor-pointer']")
    private WebElement apply;
    @FindBy(xpath = "//a[@href='https://play.google.com/store/apps/details?id=com.youapp.you_app&hl=en&gl=US']//div//div//*[name()='svg']//*[name()='rect'][1]")
    private WebElement googlePlay;
    @FindBy(xpath = "//footer[@class='section relative bg-black']//a[2]//div[1]//div[1]//*[name()='svg']//*[name()='rect'][1]")
    private WebElement appStore;
    @FindBy(xpath = "//footer[@class='section relative bg-black']//a[3]//div[1]//div[1]//*[name()='svg']//*[name()='rect'][1]")
    private WebElement appGallery;
    @FindBy(xpath = "//span[@class='px-3 animate-expand overflow-x-hidden whitespace-nowrap']")
    private WebElement whatsApp;

    public void setSwipeRight() {
        swipeRight.click();
    }

    public void setSwipeLeft() {
        swipeLeft.click();
    }

    public void setSearchKeyword(String search) {
        searchKeyword.sendKeys(search);
    }

    public void setReset() {
        reset.click();
    }

    public void setPreferences() {
        preferences.click();
    }

    public void setProfession() {
        profession.click();
    }

    public void setPersonalitie() {
        personalitie.click();
    }

    public void setSkill() {
        skill.click();
    }

    public void setDate(String datee) {
        date.sendKeys(datee);
    }

    public void setNearme() {
        nearme.click();
    }

    public void setPrice() {
        price.click();
    }

    public void setSearchcommunity1() {
        searchcommunity1.click();
    }

    public void setSearchCommunity2() {
        searchCommunity2.click();
    }

    public void setApply() {
        apply.click();
    }

    public void setGooglePlay() {
        googlePlay.click();
    }

    public void setAppStore() {
        appStore.click();
    }

    public void setAppGallery() {
        appGallery.click();
    }

    public void setWhatsApp() {
        whatsApp.click();
    }

}
