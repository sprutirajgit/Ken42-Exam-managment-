package GetExam;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetStudentReportExam {
	
	
	 WebDriver driver;
    Logger log = Logger.getLogger(GetStudentReportExam.class);

 @BeforeClass
 public void setup()
 {
	 
	  WebDriverManager.chromedriver().setup();
	  
	    driver = new ChromeDriver();
	    log.info("Launching chrome browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		driver.manage().window().maximize();
		log.info("Entering the Workbecnh Url");
		log.warn("Warning message");
 }
	

 @Test(priority=1)
 public void LoginWorkBecnh() {
	 log.info("Login to the Workbench");
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		driver.findElement(By.id("termsAccepted")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
 }
	 @Test(priority=2)
	  public void LoginSalesforce()
	  {
		 log.info("intgegrate salesfroce login");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
	  }
	  @Test(priority=3)
	  public void ClearUrl() throws InterruptedException
	  {
		  log.info("To clear Extra Url from Api Workbench uri");
		  WebElement l = driver.findElement(By.id("urlInput"));
			l.sendKeys("/services/data/v54.0");
			l.clear();
			Thread.sleep(2000);
	  }
	  @Test(priority=4)
	  public void EnterAPI() throws InterruptedException {
		  log.info("Enter the Exact URI for Api testing ");
		   driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
		   Assert.assertTrue(true);
			driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"responseList\"]/li[3]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"codeViewPortToggler\"]")).click();
	  }
	  @AfterMethod
	  public void afterMethod(ITestResult result) throws Exception {
		  log.info("If faail");
		  if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot tc = (TakesScreenshot)driver;
			File src=  tc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(result.getName()+".png"));
		  }
	  
	  
	  }
	
	 
}

