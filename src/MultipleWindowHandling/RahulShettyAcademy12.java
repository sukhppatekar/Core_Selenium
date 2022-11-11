package MultipleWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademy12
{
 public static void main(String[] args)
 {
 System.out.println("Multiple windo handling : second hyperlink");
 
 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
 
 WebDriver driver= new ChromeDriver();
 
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 //driver.manage().window().maximize();
 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 
 List<WebElement> totallink = driver.findElements(By.tagName("a"));
 int count=totallink.size();
 System.out.println("total count of hyperlink : " + count);
 
 WebElement fdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
 List<WebElement> totalfooterlink= fdriver.findElements(By.tagName("a"));
 int count1= totalfooterlink.size();
  System.out.println("Total footer hyperlink : " + count1);
  
//  WebElement pfdriver1 =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
//  List<WebElement> particularfooterlink = pfdriver1.findElements(By.tagName("a"));
//  int count2 =particularfooterlink.size();
//  System.out.println("1 : "+ count2 );

  WebElement pfdriver2 =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
  List<WebElement> particularfooterlink2 = pfdriver2.findElements(By.tagName("a"));
  int count3 =particularfooterlink2.size();
  System.out.println("2 : "+ count3 );
  
  for(int i=0; i<count3; i++)
  {
	  System.out.println("in for loop");
	String clicklink=  Keys.chord(Keys.CONTROL, Keys.ENTER);
	pfdriver2.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	
  }
Set<String> s=  driver.getWindowHandles();
  System.out.println(s);
  
//  ArrayList <String> al=new ArrayList<String>(s);
//  Iterator <String> itr= al.iterator();
  Iterator <String> itr= s.iterator();
 
  while(itr.hasNext())
  {
	  driver.switchTo().window(itr.next());
	String url =  driver.getCurrentUrl();
	
	if(url.equalsIgnoreCase("https://rahulshettyacademy.com/AutomationPractice/#"))
	{
		System.out.println("in if loop");
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
	}
	  
  }
  
 }
}
