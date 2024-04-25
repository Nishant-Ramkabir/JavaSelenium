package Selenium.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.name("proceed")).click();
		Alert a = d.switchTo().alert();
		
		String actual = a.getText();
		String expected = "Please enter a valid user name";
		System.out.println(actual);
		
		if (expected.equals(actual)) {
			System.out.println("Correct text");
		} else {
			System.out.println("Incorrect text");
		}
		
		Thread.sleep(4000);
		// To accept the alert
		a.accept();
		//To quit the alert
		d.quit();
		
				
	}

}
