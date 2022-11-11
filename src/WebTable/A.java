package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
 {
 public static void main(String[] args)
 {
 System.out.println("WebTable program");	
 
 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
 
 WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/Shree/Downloads/table.html");
 
List<WebElement>trows= driver.findElements(By.tagName("tr")); 
int rcount=trows.size();
System.out.println("total row counts: " +rcount);

for (WebElement rows : trows) 
 {
 List<WebElement> tcol= driver.findElements(By.tagName("td"))	;
 
 for (WebElement col : tcol) 
 {
	System.out.println(col.getText());
 }
 }
   for (WebElement abc6 : trows) 
   {
	
	  List<WebElement>row7= driver.findElements(By.xpath("/html/body/table/tbody/tr[7]"));
	  
	  for (WebElement rw7 : row7) 
	  {
		System.out.println(rw7.getText());
	}
}
}
}
