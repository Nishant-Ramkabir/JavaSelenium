package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.get("https://selectorshub.com/xpath-practice-page/");
		d.manage().window().maximize();
		
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.linkText("Resources"))).build().perform();
		Thread.sleep(3000);
		d.findElement(By.linkText("Tutorials")).click();
		Thread.sleep(3000);
		
		d.close();

	}

}
