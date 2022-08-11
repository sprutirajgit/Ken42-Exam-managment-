package GetExamAllureReport;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import GetExam.GetStudentReportExam;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteExamDashBoard {
	 WebDriver driver;
	 Logger log = Logger.getLogger(GetStudentReportExam.class);
	 
	 @BeforeClass
	  public void setup()
	  {
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    log.info("Launching chrome browser");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
			log.info("Launching the FrontEnd portal");
			driver.manage().window().maximize();
			log.info("Maximize the Browser");
	  }
	 @Test(priority=1)
	 public void UpcommingExam() throws InterruptedException {
		 driver.findElement(By.xpath("//span[.='Sign In']")).click();
         Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
     	Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/button")).click();
         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
         System.out.println("The number of Record  is from Portal on 7 days Filletr "+ row.size());
         log.info("The number of Record  is from Portal on 7 days Filletr "+ row.size());
         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
 		log.info("Launching the WorkBench URL");
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
 		driver.findElement(By.id("termsAccepted")).click();
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
 		log.info("Login to the WorkBench");
 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
 			log.info("Connect Workbench & salesforce integrate");
 			 WebElement l = driver.findElement(By.id("urlInput"));
 			l.sendKeys("/services/data/v54.0");
 			l.clear();
 			Thread.sleep(2000);
 			log.info("Clear the Extra API On the URI ");
 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
 			  log.info("on the api Testing Here We fillter the Exam Complete the 7 days");
 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
 				
 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
 				Thread.sleep(10000);
 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
 				log.info("To show the Response came from Salesforce & the record count 7");
 				
	 }
	 
	 
}
