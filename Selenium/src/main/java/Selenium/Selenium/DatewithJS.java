package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatewithJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.goindigo.in/");
		Thread.sleep(3000);
		WebElement e = d.findElement(By.xpath("//input[@placeholder='Travel Dates']")); 
		
		String DateVal = "27 Dec 2023";
		Datepick(d, e, DateVal);
		Thread.sleep(3000);
		
		d.close();
		
		
	}
	
	public static void Datepick(WebDriver d, WebElement e, String DateVal) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].setAttribute(value,'"+DateVal+"');", e);
		
		
	}

}
