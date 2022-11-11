package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resbus 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.out.println("This is Redbus Calender program");

	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.redbus.in/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
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
		  
		  
		  List<WebElement> wkdays=driver.findElements(By.cssSelector("td[class='wd day']"));
		 int countwkdays=wkdays.size();
		 System.out.println("week days : " + countwkdays);
		 
		 for(int i=0; i<countwkdays; i++)
		 {
			 System.out.println("in for loop");
			String dayvalue= driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
			 
			if(dayvalue.equalsIgnoreCase("3"))
			{
				driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
				 
			}
		 }
	   }
	
	
}