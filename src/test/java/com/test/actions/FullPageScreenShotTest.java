package com.test.actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class FullPageScreenShotTest {
	 @Test
	    public void alertAction() throws IOException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver =  new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	     // capture screenshot and store the image
	        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	        ImageIO.write(s.getImage(),"PNG",new File("D:\\SeleniumScreenshots\\fullPageScreenshot.png"));
	        
	        driver.close();
	 }
}
