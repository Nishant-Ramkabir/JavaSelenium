package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		Launcher.launch();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement element = driver.findElement(By.xpath("//body/div[@id='page']/main[@id='content']/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[3]"));
		WebElement element1 = driver.findElement(By.xpath("//h3[contains(text(),'Users Table')]"));
		
		//To highlight the element
		//flash(element, driver);
		
		//To scroll the window
		scrollv(element1, driver);
		
		Thread.sleep(2000);
		//To create the border around the element
		border(element1, driver);
		
		//Normal scroll
		scroll(driver);
		//To throw the alert
		//Jalert(driver, "This is a bug");
		
		//To click on the element
		//jclick(element,driver);
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static void scrollv(WebElement element, WebDriver driver) 
	{
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		
	}
	
	public static void scroll(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		String bgcolor = element.getCssValue("backgroundcolor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(300,0,0)", element, driver);
			changeColor(bgcolor, element, driver);	
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver )	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(200);
			}
		catch (InterruptedException e) {
		}
		
	}
	
	public static void border(WebElement element,WebDriver driver)  
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].style.border = '4px solid red'", element);
		
	}
	
	public static void Jalert(WebDriver driver, String s)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+s+"')");
	}
	public static void jclick(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
}
