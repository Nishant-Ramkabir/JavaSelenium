package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarPicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Launcher.launch();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		
		WebElement frame1 = d.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/iframe[1]"));
						   
		d.switchTo().frame(frame1);
		
		
		d.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
	
		
		Select s = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		s.selectByValue("11");
		Thread.sleep(2000);
		
		Select s1 = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s1.selectByValue("2024");
		
		
		String xpath1 = "/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[";
		String xpath2 = "]/td[";
		String xpath3 = "]/a[1]";
		
		boolean flag = false;
		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				String value = d.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
				System.out.println(value);
				
				if (value.equals("27")) {
					
					d.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
				
		
		Thread.sleep(2000);
		d.close();
		
		
		
		

	}

}
