package Selenium.Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearchList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.amazon.in/");
		
		/*d.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Nishant ramn");
		
		List<WebElement> l= d.findElements(By.xpath("//div[@role='presentation']//ul[@role='listbox']//li[@class='sbct']"));
		Thread.sleep(3000);
		
		System.out.println(l.size());*/
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
		Thread.sleep(5000);
		
		List<WebElement> list = d.findElements(By.xpath("//div[@class='left-pane-results-container']/descendant::div[@role='button']"));
		
		Thread.sleep(3000);
		
		int size = list.size();
		
		System.out.println("Number of ele " + size);
		
		for (int i = 0; i < list.size(); i++) {
			
			String s = list.get(i).getText();
			System.out.println("Link Number "+i+" Name "+s);
			
			if (list.get(i).getText().contains("iphone 12")) {
				list.get(i).click();
				break;
				
			}
		}
		
		Thread.sleep(3000);
		d.close();

	}

}
