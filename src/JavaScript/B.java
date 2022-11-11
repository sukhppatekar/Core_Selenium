package JavaScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.out.println("Java script/ calender");
	
	System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//javascript code
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,350)");
	
	WebElement cityname=driver.findElement(By.id("fromPlaceName"));
	cityname.sendKeys("BENG");
	
	//from place
	
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	String jcityname="return document.getElementById(\"fromPlaceName\").value;";
	String ctynm=(String) js1.executeScript(jcityname);
	System.out.println(ctynm);
	
	while(!ctynm.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
	{
		Thread.sleep(1000);
		cityname.sendKeys(Keys.DOWN);
		
		//mandatorily write next two lines otherwise loop will perform continuously
		
		 jcityname="return document.getElementById(\"fromPlaceName\").value;";
		 ctynm=(String) js1.executeScript(jcityname);
		 System.out.println("In while loop :-" + ctynm);
		 
		
	}
	    
	    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	    
	    //........................going to
	    
	  WebElement fpcityname=  driver.findElement(By.id("toPlaceName"));
	  fpcityname.sendKeys("BA");
	  
	  //javascript syntax
	  JavascriptExecutor js2= (JavascriptExecutor)driver;
	  
	 String cityname1= "return document.getElementById(\"toPlaceName\").value;";
	// System.out.println(cityname1);
	String jcityname1=  (String) js2.executeScript(cityname1);
	System.out.println(jcityname1);
	
	
	while(!jcityname1.equalsIgnoreCase("BANGALORE"))
	{
		Thread.sleep(1000);
		fpcityname.sendKeys(Keys.DOWN);
		
		  
		 cityname1="return document.getElementById(\"toPlaceName\").value;";
		 jcityname1=(String) js2.executeScript(cityname1);
		 System.out.println("In while loop 2:-" + jcityname1); 
	}
	    driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
	    
//..................................for Date
	    
	    driver.findElement(By.xpath("//*[@id=\"txtJourneyDate\"]")).click();
	    Thread.sleep(2000);
	    while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("August"))
	    {
	    	System.out.println("while loop");
	    	driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
	    	Thread.sleep(2000);
	    }	
	    
	   List<WebElement>days= driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	   int countdays=days.size();
	   System.out.println("Totaldays : "+ countdays );
	 }
}
