package JavaScript;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo 
{
public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Calender Handling ");
			
			System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\104\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		   driver.get("https://www.redbus.in/");
		   driver.manage().window().maximize();
		   
		   
		   driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/label")).click();
		  WebElement fcity= driver.findElement(By.id("src"));  
		  fcity.sendKeys("amr");
		  
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		
		 String  jfcity= "return document.getElementById(\"src\").value;";
		 String fromcityname=(String)js.executeScript(jfcity);
		   System.out.println(fromcityname);
		   
		   while(!fromcityname.equalsIgnoreCase("Amritsar"))
		   {
			  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Thread.sleep(3000);
			   System.out.println("in while loop _ from city");
			   fcity.sendKeys(Keys.DOWN);
			     jfcity= "return document.getElementById(\"src\").value;";
				 fromcityname=(String) js.executeScript(jfcity);
				  
		   }
		   driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		   
		  WebElement tcity= driver.findElement(By.id("dest"));
		  tcity.sendKeys("cha");
		  JavascriptExecutor js1= (JavascriptExecutor)driver;
		 String jtcity= "return document.getElementById(\"dest\").value;";
		 String tocity=(String) js1.executeScript(jtcity);
		 System.out.println(tocity);
		 
		 while(!tocity.equalsIgnoreCase("Chandrapur"))
		 {
			 Thread.sleep(3000);
			System.out.println("while loop _ to city"); 
			tcity.sendKeys(Keys.DOWN);
			 jtcity= "return document.getElementById(\"dest\").value;";
			 tocity=(String) js1.executeScript(jtcity);
		 }
		 driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		   
			
		   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		   
		   while(!driver.findElement(By.cssSelector("[class='rb-calendar'] [class='rb-monthHeader']")).getText().contains("Oct 2022"))
		   {
			   System.out.println("while loop");
			   
			   driver.findElement(By.cssSelector("[class='rb-monthHeader'] [class='next']")).click();
		   }
		
		   List<WebElement> list1=driver.findElements(By.cssSelector("td[class='wd day']"));
	       List<WebElement>list2=driver.findElements(By.xpath("//td[@class=\"we day\"]"));
	       list1.addAll(list2);
		   int count=list1.size();
		   System.out.println("No. of Days "+count);
		   
//	     for (int i = 0; i < 31; i++) {
//		    
//	    	 String date=driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
//	    	 
//	    	 
//	    	 if (date.equalsIgnoreCase("28")) {
//				
//	    		 driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
//			}
//	    	 
		   for (WebElement w : list1) {
			   
			   String datee = w.getText();
			
			   if (datee.equals("28")) {
				   
				w.click();
			}
		   }
}
}