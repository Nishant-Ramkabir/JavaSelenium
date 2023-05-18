package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		
		d.get("https://html.com/input-type-file/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//Type should be file the only it will work
		d.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\nishant.ramkabir\\Downloads\\New-Tax-Regime-vs-Old-Calculator_By-AssetYogi.xlsx");
		Thread.sleep(3000);
		d.quit();
	}

}
