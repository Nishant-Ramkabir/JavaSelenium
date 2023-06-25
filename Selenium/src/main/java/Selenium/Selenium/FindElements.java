package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher.launch();
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		//HOw to get the size of number of elements 
		List<WebElement> list = d.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		//How to get the text of each elements
		
		for (int i = 0; i < list.size(); i++) {
			
			String s = list.get(i).getText();
			System.out.println("Link Number "+i+" Name "+s);
		}
		
		d.close();
		
		

	}

}
