package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Loadprop {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\nishant.ramkabir\\git\\JavaSelenium\\Selenium\\src\\main\\java\\Selenium\\Selenium\\config.properties");
		
		prop.load(file);
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		
		if (prop.getProperty("Browser").equals("Chrome")) {
			Launcher.launch();
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			
			d.get(url);
			Thread.sleep(3000);
			d.findElement(By.xpath(prop.getProperty("Fname_x"))).sendKeys(prop.getProperty("Fname"));
			d.findElement(By.xpath(prop.getProperty("Lname_x"))).sendKeys(prop.getProperty("Lname"));
			d.findElement(By.xpath(prop.getProperty("Email_x"))).sendKeys(prop.getProperty("Email"));
			d.findElement(By.xpath(prop.getProperty("Gender_x"))).click();
			d.findElement(By.xpath(prop.getProperty("Mobile_x"))).sendKeys(prop.getProperty("Mobile"));
			//d.findElement(By.tagName(prop.getProperty("Subjects_x"))).sendKeys(prop.getProperty("Subjects"));
			
			d.findElement(By.xpath(prop.getProperty("Hobbies_x"))).click();
			d.findElement(By.xpath(prop.getProperty("Picture_x"))).sendKeys(prop.getProperty("Picture"));
			d.findElement(By.xpath(prop.getProperty("Address_x"))).sendKeys(prop.getProperty("Address"));
			
			WebElement sta = d.findElement(By.xpath(prop.getProperty("State_x")));
			Actions a = new Actions(d);
			a.moveToElement(sta).click().sendKeys("NCR").build().perform();
			
			
			Thread.sleep(3000);			
			d.findElement(By.xpath(prop.getProperty("Submit_x"))).submit();
			Thread.sleep(3000);	
			
			
			//Verify the Data from the submitted form
			String name = d.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
			
			if (name.contains(prop.getProperty("Fname"))) {
				System.out.println("Name is matching ");
			}else {
				System.out.println("Name is not matching");
			}
			
			d.close();
		}
		else {
			System.out.println("Not Given the browser name");
		}
			
		
	
	}

}
