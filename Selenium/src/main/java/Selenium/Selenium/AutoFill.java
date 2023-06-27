package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFill {

	public static void main(String[] args) throws InterruptedException {
		Launcher.launch();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		/*
		d.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
		//d.switchTo().frame(1);
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='myInput']")).click();
			
		
		WebElement e = d.findElement(By.xpath("//input[@id='myInput']"));
		e.sendKeys("india");
		e.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);	
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
			
		
		d.quit();
		*/
		d.get("https://www.globalsqa.com/demo-site/auto-complete/#Categories");
		Thread.sleep(3000);
		WebElement e = d.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
	
		d.switchTo().frame(e);
		Thread.sleep(3000);
		String S = d.findElement(By.xpath("//label[contains(text(),'Search:')]")).getText();
		System.out.println(S);
		
		WebElement name = d.findElement(By.xpath("//input[@id='search']"));
		name.sendKeys("andreas andersson");
		name.sendKeys(Keys.ARROW_DOWN);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		d.close();
		
		
		
	}

}
