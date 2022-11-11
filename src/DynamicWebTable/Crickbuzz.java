package DynamicWebTable;

//for 1st inning - runs

//dynamic table
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz 
{
	 public static void main(String[] args)
	 {
	 System.out.println("WebTable program");	
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	 
	 //to get on the 1st table first by using dynamic xpath - child xpath
	 WebElement table= driver.findElement(By.xpath("//div[@id='innings_1']/child :: div[1]"));
	 
	 //to count rows in the 1st inning table
	 List<WebElement> ls=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	 int count= ls.size();
	 System.out.println(count);
	 
	 //for run
	 
	 List<WebElement>rls= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
	 int rcount=rls.size();
	 System.out.println(rcount);
	 
	 int sum=0;
	 for(int i=0; i<rcount-2; i++) // minus 2 because of extra and total run rows
	 {
		 
	 String run=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();

	 //to convert string into int
	
	 int runvalue=Integer.parseInt(run);
	 sum= sum+ runvalue;
	 
	 }
	 System.out.println("Run is : "+ sum);
	 
	 //Extra run
	 
	String erun= table.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText();
	int erunval= Integer.parseInt(erun);
	System.out.println("Extra run is : " + erunval);
	//total run
	
	int totalrun= sum+erunval;
	System.out.println("Total run is : " + totalrun);
	
	//for player name
	
	List<WebElement> player=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(1)"));
	int cplayer=player.size();
	System.out.println(cplayer);
	
	for(int j=0; j<cplayer; j++)
	{
	String playername=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(1)")).get(j).getText();
	System.out.println(playername);
	
	}
	
	}
}
