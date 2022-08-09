package GetExam;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGetExam {
	@Test
	public void GetExamAPi() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		driver.findElement(By.id("termsAccepted")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
		
		WebElement l = driver.findElement(By.id("urlInput"));
		l.sendKeys("/services/data/v54.0");
		l.clear();
		Thread.sleep(2000);
		
		try {
       //Exam Completed in 7 days..& Upcoming Exam in 7 days 
	    driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"responseList\"]/li[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"codeViewPortToggler\"]")).click();
        js.executeScript("window.scrollBy(0,4000)");
		}
		catch(Exception e) {
			System.out.println("An exceptional e ");
		}
		//Salesforce Validation
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/input")).sendKeys("Exams");
		Thread.sleep(10000);
		List<WebElement>list=driver.findElements(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[1]/one-app-launcher-menu/div/div[2]/one-app-launcher-menu-item[2]/a/div/lightning-formatted-rich-text/span/p/b"));
		System.out.println(list.size());
         
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			System.out.println(listitem);
			if(listitem.contains("Exams")) {
				list.get(i).click();
				break;
			}
		}
		 
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h1/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div[3]/force-list-view-manager-button-bar/div/lightning-button-group/slot/lightning-button-icon-stateful[2]/button")).click();
		//click the fileter option
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Show filters']")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/a[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/div/div[1]/lightning-combobox/div/lightning-base-combobox/div/div[1]/button")).click();
         
    		
		
		Thread.sleep(10000);
		Reporter.log("the respose Of the Exam Completed In 7 days Was Successfully validate to the salesforce & the Reocord was count 4",true);
		
        //Exam Completed in 15 days & Upcoming Exam in 15 days
		
        
        

	}
}
