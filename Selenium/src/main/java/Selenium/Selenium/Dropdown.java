package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Launcher.launch();
		WebDriver d =  new ChromeDriver();
		d.get("https://selectorshub.com/xpath-practice-page/");
		d.manage().window().maximize();
		
		WebElement Dropdown = d.findElement(By.cssSelector("#cars"));
		Select s = new Select(Dropdown);
		
		s.selectByValue("audi");
		
		Thread.sleep(1000);
		
		s.selectByValue("opel");
		
		Thread.sleep(1000);
		
		d.quit();

	}

}
