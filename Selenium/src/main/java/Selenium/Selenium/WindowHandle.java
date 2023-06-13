package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
		d.findElement(By.xpath("//a[contains(text(),'RUN POPUP TEST')]")).click();
		Thread.sleep(3000);
		Set <String> handlr = d.getWindowHandles();
		Iterator<String> it =handlr.iterator();
		
		String mainWIindow = it.next();
		System.out.println("Window 1 "+mainWIindow);
		
		String secWindow = it.next();
		System.out.println("Window 2 "+secWindow);
		
		d.switchTo().window(secWindow);
		String src= d.getPageSource();
		System.out.println("Page src "+src);
		d.close();
		
		Thread.sleep(3000);
		
		d.switchTo().window(mainWIindow);
		String title = d.getTitle();
		System.out.println("Page title "+title);
		d.close();
		
		

	}

}
