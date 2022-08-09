package GetExamAllureReport;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import GetExam.GetStudentReportExam;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.TakesScreenshot;


public class ExamDashReport {
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
		log.info("Launching the WorkBench URL");
		driver.manage().window().maximize();
		log.info("Maximize the Browser");
  }
  @Test(priority=1)

  @Step("Success WorkBench login ")
  public void loginWorkBench()
  {
      

	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		driver.findElement(By.id("termsAccepted")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
		log.info("Login to the WorkBench");
		
  }
 
  
  @Test(priority=2)
  public void LoginSalesforce()
  {
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
		log.info("Connect Workbench & salesforce integrate");
  }
  @Test(priority=3)
  public void ClearUrl() throws InterruptedException
  {
	  WebElement l = driver.findElement(By.id("urlInput"));
		l.sendKeys("/services/data/v54.0");
		l.clear();
		Thread.sleep(2000);
		log.info("Clear the Extra API On the URI ");
  }
  @Test(priority=4)
  public void EnterAPI() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
	  log.info("on the api Testing Here We fillter the Exam Complete the 7 days");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"responseList\"]/li[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"codeViewPortToggler\"]")).click();
		log.info("To show the Response came from Salesforce");
  }
  @Test(priority=5)
  public void LoginSalesforceValidate() {
	  log.info("login to salesforce to check...");
	  driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[1]")).sendKeys("Test@123456");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
		
  }
  @Test(priority=6)
  public void NavigateObjectOnSalesforce() throws InterruptedException {
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
		log.info("Seacrh the Exam Oject ");
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[1]/h1/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div[3]/force-list-view-manager-button-bar/div/lightning-button-group/slot/lightning-button-icon-stateful[2]/button")).click();
		//click the fileter option
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Show filters']")).click();
		log.info("display the Record On the Exam object Which Exam was complete On 7days ");
		
  }
  @Test(priority=7)
  @Step("Response from WorkBench")
  @Description("the respose Of the Exam Completed In 7 days Was Successfully validate to the salesforce & the Reocord was count 4")
  public void VerifyResponseResults() throws InterruptedException {
	  Thread.sleep(10000);
		Reporter.log("the respose Of the Exam Completed In 7 days & reocrd Count 4",true);
		 driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
         driver.findElement(By.xpath("//span[.='Sign In']")).click();
         Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
     	Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[3]/button")).click();
         Thread.sleep(1000);
         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
        System.out.println("The number of Record  is from Portal "+ row.size());
        log.info("After verify the portal Record = Salesforce Record= Response which was get form API Was 3 ");
  }
  @AfterMethod
	 public void afterMethods(ITestResult result) throws Exception {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot tc = (TakesScreenshot)driver;
			File src=  tc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(result.getName()+".png"));
		  }
			  
	  }
 
}
