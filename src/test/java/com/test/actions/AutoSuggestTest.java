package com.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apsrtconline.in/oprs-web/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#fromPlaceName")).click();
        driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("tiru");
        List<WebElement> cities =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        System.out.println(" number of cities "+ cities.size());
        for (WebElement city :cities) {
            System.out.println(city.getText()); // just to print cities names
            if (city.getText().equalsIgnoreCase("TIRUPATHI")){
                city.click();
                break;
            }
        }
    }
}
