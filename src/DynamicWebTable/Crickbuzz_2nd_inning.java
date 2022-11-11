package DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz_2nd_inning 
 {
	 public static void main(String[] args)
	 {
	 System.out.println("WebTable program");	
	 
	 System.setProperty("webdriver.chrome.driver", "E:\\Tb_16\\103\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	 
	 //to select table by using dynamic xpath : child 
	 WebElement table=driver.findElement(By.xpath("//div[@id='innings_2']/child :: div[1]"));
	 
	 //(//div[@id='innings_1']/child :: div(1))
	 
	 //total rows count
	 
	List<WebElement> rrows= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	int totalrows=rrows.size();
	System.out.println("Total rows count :" +totalrows);
	
	//total run row count
	
	List<WebElement> runrowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
	int totalrun=runrowcount.size();
	System.out.println("total run row count : " +totalrun);
	 
	//total run sum
	
	int sum=0;
	for(int i=0; i<totalrun-2; i++)
	{
	String run=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
	
	int trun=Integer.parseInt(run);
	
	sum=sum+trun;
	}
	System.out.println("Total run :"+ sum);
	
	//for extra run
	
	String erun=table.findElement(By.xpath("//*[@id=\"innings_2\"]/div[1]/div[13]/div[2]")).getText();
	
	int erun1=Integer.parseInt(erun);
	
	System.out.println("extra run : " + erun1);
	
	int totalrun1 = sum + erun1;
	System.out.println("Total run : " + totalrun1);
	
	//for ball rows
	List<WebElement> ballrows=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)"));
	int bcount=ballrows.size();
	System.out.println("Ball count rows :" +bcount);
	 
	int sum1=0;
	for(int i1=0; i1<bcount; i1++) 
	{
	String tball=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i1).getText();
	int tball1=Integer.parseInt(tball);
	//System.out.println("Total ball :" + tball1);
	sum1=sum1+tball1;
	}
	System.out.println("Total ball count :" + sum1);
	}
 }
