package com.test.actions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSL {
	@Test
	public void chromeSsl() {
		
		//desired capabilities 
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		// add capabilities to chrome options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(capabilities);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://api.plos.org/solr/examples/");
	}
	
	@Test
	public void firefoxSsl() {
		// https://www.guru99.com/ssl-certificate-error-handling-selenium.html
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		
		WebDriverManager.firefoxdriver().setup();
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver((Capabilities) profile);
	}
}
