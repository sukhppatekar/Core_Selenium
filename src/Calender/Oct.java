package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("This is Calender program");

		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
//	List<WebElement>ls=	driver.findElements(By.tagName("iframe"));
//	int count=ls.size();
//	System.out.println(count);
//	
//	WebElement fin=driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(fin);
		
		driver.findElement(By.id("datepicker1")).click();
		
	while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("April"))
		
	{
		System.out.println("in while loop");
		
	//	driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
	//for april 2022
		driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
	
	}		
	
	List<WebElement>lss = driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
	int cou=lss.size();
	System.out.println(cou);
	
	for(int i=0; i<cou;i++)
	{
		String dayvalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
		
		if(dayvalue.equalsIgnoreCase("3"))
		{
			driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
		}	
	}
 }
 }