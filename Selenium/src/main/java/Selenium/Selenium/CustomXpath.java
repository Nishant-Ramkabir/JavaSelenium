package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//https://www.scientecheasy.com/2019/11/xpath-contains-text.html/
		
		//disadvantage of absolute x-path
		//Performance issue
		//Not reliable
		//Can be changed  in the future
		
		
		d.get("https://selectorshub.com/xpath-practice-page/");
		
		//Custom x path
		d.findElement(By.xpath("//button[@class='dropbtn']"));
		
		//Contains method
		d.findElement(By.xpath("//input[contains(@type,'number')]")).sendKeys("989898");
		
		//starts-with method
		d.findElement(By.xpath("//input[starts-with(@name,'company')]")).sendKeys("api");
		
		//ends-with method
		//Sd.findElement(By.xpath("//input[ends-with(@title,'Password')]")).sendKeys("kills");
		
		
		//for links Contains with text()
		d.findElement(By.xpath("//a[contains(text(),'Click to practice')]")).click();
		
		Thread.sleep(3000);
		
		d.close();
	}

}
