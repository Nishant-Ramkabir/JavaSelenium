package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launcher.launch();
		
		//drag1();
		drag2();
		
	}
	
	
	public static void drag1() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		Actions a = new Actions(d);
		
		a.clickAndHold(d.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(d.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
		Thread.sleep(3000);
		d.quit();
		
	}
	
	public static void drag2() throws InterruptedException {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://jqueryui.com/droppable/");
		d1.manage().window().maximize();
		d1.switchTo().frame(0);
		Actions a = new Actions(d1);
		
		WebElement source = d1.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = d1.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, destination);
		Thread.sleep(3000);
		d1.quit();
	}

}
