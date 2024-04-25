package Selenium.Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import org.apache.commons.*;

public class ScreenshotAndExplicitWait {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Launcher.launch();
		//SS();
		eWait();
		

	}
	
	public static void eWait() {
		WebDriver d = new ChromeDriver();
		d.get("https://selectorshub.com/xpath-practice-page/");
		d.manage().window().maximize();

		//Explicit Wait until the element located
		WebElement elmt = new WebDriverWait(d,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(),'Useful Links for learning')]")));
		System.out.println("Text is "+elmt.getText());
		d.quit();
		
	}
	
	
	public static void SS() throws IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://selectorshub.com/xpath-practice-page/");
		d.manage().window().maximize();
		
		//Take SS and store it in file format 
		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		//Copy the file to the destination
		Files.copy(src, new File("E:\\Selenium\\abc.png"));
		
		d.quit();
	}

}
