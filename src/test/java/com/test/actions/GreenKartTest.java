package com.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKartTest {
    @Test
    public void addVegetabulesToCart() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        int j = 0;
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        String vege[]= {"Tomato","Mushroom","Potato","Pumpkin","Apple"};
        List<String> vegeList = Arrays.asList(vege);
        List<WebElement> getVegesList=driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i<getVegesList.size(); i++){
            String[] vegeNames=getVegesList.get(i).getText().split("-");
            String currentVege=vegeNames[0].trim();
            if (vegeList.contains(currentVege)){
            	j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == vege.length) {
					break;
				}
            }
        }
        driver.findElement(By.cssSelector("*[alt='Cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        Thread.sleep(3000);
        WebElement selectCuntry=driver.findElement(By.xpath("//select"));
        Select select = new Select(selectCuntry);
        select.selectByVisibleText("India");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".chkAgree")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
    }
}
