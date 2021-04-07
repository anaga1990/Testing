package com.test.browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LaunchFirefoxTest {

    @Test
    public void launchFireFox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }

}
