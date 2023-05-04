package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		Launcher.launch();
		WebDriver d = new ChromeDriver();
	  
	
		d.get("https://www.google.com");
		Thread.sleep(500);
		System.out.println("Title Name"+d.getTitle());
		
		String title = d.getTitle();
		
		if (title.equals("Google")) {
			System.out.println("Correct title");
			
		} else {
			System.out.println("Incorrect title");
		}
		
		d.close();
		
	}

}
