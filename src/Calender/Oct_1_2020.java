package Calender;
// if i want to select year 2020 
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct_1_2020 
{
	public static void main(String[] args) {
		System.out.println("Calender program for 1/oct/2020");

		System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");

//	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("datepicker1")).click();
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")).getText().contains("2020")) 
		{
			System.out.println("in while loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
			// driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget
			// ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon
			// ui-icon-circle-triangle-w']")).click();


		while (!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("October")) 
		{
			System.out.println("in while loop");
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
			// driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget
			// ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon
			// ui-icon-circle-triangle-w']")).click();

		}
		}
		List<WebElement> dl = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int dayscount = dl.size();
		System.out.println("Total day count : " + dayscount);
       
       
        for(int i=0; i<dayscount; i++)
        {
        	String dayvalue=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
        	
        	if(dayvalue.equalsIgnoreCase("1"))
        	{
        		driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
            }
        }
        
	}
}
