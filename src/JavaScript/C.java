package JavaScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//redbus
public class C 
{
   public static void main(String[] args) throws InterruptedException {
	

		System.out.println("javascript_redbus");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\104\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]")).click();
		
		//from city
		  WebElement fromcity = driver.findElement(By.id("src"));
		  fromcity.sendKeys("Na");
		  
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  String fcity= "return document.getElementById(\"src\").value;";
		  String fcityyy=(String) js.executeScript(fcity);
		  System.out.println(fcityyy);
		  
		  Thread.sleep(3000);
		  while(!fcityyy.equalsIgnoreCase("Nashik Trimbakeshwar Package"))
		  {
			  fromcity.sendKeys(Keys.DOWN);
			  
			   fcity= "return document.getElementById(\"src\").value;";
			   fcityyy=(String) js.executeScript(fcity);
			   System.out.println(fcityyy);
		  }
		  fromcity.sendKeys(Keys.ENTER);
		 //to destination
		WebElement tocity= driver.findElement(By.id("dest"));
		tocity.sendKeys("Amr");
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		String tcity="return document.getElementById(\"dest\").value;";
		String tcityyy=(String)  js1.executeScript(tcity);
		  System.out.println(tcityyy);
		  Thread.sleep(3000);
		  while(!tcityyy.equalsIgnoreCase("Warud (Amravati)"))
		  {
			  tocity.sendKeys(Keys.DOWN);
			  tcity="return document.getElementById(\"dest\").value;";
				 tcityyy=(String)  js1.executeScript(tcity);
				  System.out.println(tcityyy);
			  
		  }
		  tocity.sendKeys(Keys.ENTER);
		  
		  while(!driver.findElement(By.cssSelector("#search > div > div.fl.search-box.date-box.gtm-onwardCalendar > div > label")).getText().contains("Aug 2022"))
		  {
			  driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr.rb-monthHeader > td.next")).click();
			  driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(4) > td:nth-child(3)")).click();
			  
		  }
		  
		  driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		  
		
}
}
