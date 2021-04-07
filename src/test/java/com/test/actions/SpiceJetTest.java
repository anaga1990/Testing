package com.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpiceJetTest {
    @Test
    public void bookOneWayTrip (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        WebElement adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
        Select select = new Select(adult);
        select.selectByVisibleText("5");
        WebElement child=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
        Select se = new Select(child);
        se.selectByVisibleText("2");
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
        if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")){
            System.out.println("round trip calendar Disabled");
            Assert.assertTrue(true);
        }else {
            System.out.println("round trip calendar Enabled");
            Assert.assertTrue(false);
        }
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Flight')]")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Flight')]")).getText(),"DEPARTURE FLIGHT");
    }
}
