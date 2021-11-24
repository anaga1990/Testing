package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInvokeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/WorldlineProject/Workspace/Test/SeleniumDemo/drivers/chromedriver.exe");
		ChromeDriver chm = new ChromeDriver();
		
		chm.manage().deleteAllCookies();
		chm.manage().window().maximize();
		chm.get("https://chromedriver.storage.googleapis.com/index.html?path=95.0.4638.69/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			chm.close();
		}
		
		
		
	}
}
