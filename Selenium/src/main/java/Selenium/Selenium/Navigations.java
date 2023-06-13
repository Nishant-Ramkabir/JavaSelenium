package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Launcher.launch();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		d.get("https://www.google.com/");
		d.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		d.navigate().back();
		d.navigate().forward();
		d.navigate().back();
		d.navigate().refresh();
		Thread.sleep(3000);
		d.quit();
		

	}

}
