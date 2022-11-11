package DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz_ball
{
	 public static void main(String[] args)
	 {
	 System.out.println("WebTable program");	
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	 
	 WebElement table= driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));
	 
	 
	 List<WebElement> totalrows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	 int count= totalrows.size();
	 System.out.println(count);
	 
	 List<WebElement>rls= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)"));
	 int count1=rls.size();
	 System.out.println(count1);
	 
	 int sum=0;
	 for(int i=0; i<count1; i++)
	 {
		String ball= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
		int ballcount= Integer.parseInt(ball);
		sum=sum+ballcount;
	 }
	 
	 System.out.println("Total ball count: " + sum);
	 
	 
	 
	 
	 
}
}