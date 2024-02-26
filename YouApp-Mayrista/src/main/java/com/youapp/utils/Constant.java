package com.youapp.utils;

import com.youapp.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Constant {
    private WebDriver driver;
    public Constant(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public final static long TIMEOUT = 10;
    public final static String URLYOUAPP = "https://youapp.ai/en-us/group/join/programmers-sea";
    public final static String URLCOMMUNITIES = "https://youapp.ai/en-us/communities";
    public final static String URLEXPERIENCES = "https://youapp.ai/en-us/experiences";
    public final static String URLEVENTS = "https://youapp.ai/en-us/events";
    public final static String URLGROUPS = "https://youapp.ai/en-us/groups";
}
