package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nishant.ramkabir\\Desktop\\chromedriver_win32\\chromedriver.exe");
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com");
		
		d.findElement(By.name("q")).sendKeys("Google is god");
		d.findElement(By.className("lnXdpd")).click();
		Thread.sleep(200);
		d.findElement(By.name("btnK")).submit();
		
		Thread.sleep(300);
		d.quit();
		
		
		
	}

}
