package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.get("https://selectorshub.com/iframe-scenario/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.switchTo().frame("pact1");
		Thread.sleep(3000);
		d.findElement(By.id("lost")).click();
		d.findElement(By.id("inp_val")).sendKeys("Ana de arms");
		
		d.switchTo().frame("pact2");
		Thread.sleep(3000);
		d.findElement(By.id("connect")).click();
		Thread.sleep(4000);
		
		d.close();
		

	}

}
