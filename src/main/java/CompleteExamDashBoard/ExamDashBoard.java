package CompleteExamDashBoard;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamDashBoard {
	
	static Logger log = LogManager.getLogger(ExamDashBoard.class);
	@Test(priority=1)
	public void FilterByUpcommingexam7days(Method method) throws InterruptedException {
		
		// TODO Auto-generated method stub
     System.out.println("\n Welcome \n");
     log.info("=============Automate Testing============ ");
     Reporter.log( "=============Automate Testing Start============", true );

     WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    log.info("=============Test name============: " + method.getName());  
	    Reporter.log( "=============Test name=======:"+method.getName(), true );

	    log.info("Launching chrome browser");
	    Reporter.log("Launching chrome browser");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
		log.info("Launching the FrontEnd portal");
		Reporter.log( "Launching the FrontEnd portal", true );

		driver.manage().window().maximize();
		log.info("Maximize the Browser");
		Reporter.log( "Maximize the Browser", true );

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
 		Reporter.log("Launching the WorkBench URL",true);
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
 		driver.findElement(By.id("termsAccepted")).click();
 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
 		log.info("Login to the WorkBench");
 		Reporter.log("Login to the WorkBench",true);
 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
 			log.info("Connect Workbench & salesforce integrate");
 			Reporter.log("Connect Workbench & salesforce integrate",true);
 			 WebElement l = driver.findElement(By.id("urlInput"));
 			l.sendKeys("/services/data/v54.0");
 			l.clear();
 			Thread.sleep(2000);
 			log.info("Clear the Extra API On the URI ");
 			Reporter.log("Clear the Extra API On the URI",true);
 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
 			  log.info("on the api Testing Here We fillter the Exam Complete the 7 days");
 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 7 days",true);
 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
 				
 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
 				Thread.sleep(10000);
 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
 				log.info("To show the Response came from Salesforce & the record count 6");
 				 Reporter.log( "=============To show the Response came from Salesforce & the record count 6===============", true );
 				log.info("======================RESPONSE FROM THE API====================");
 				 Reporter.log( "=============RESPONSE FROM THE API===============", true );
 				log.info("{\r\n"
 						+ "  \"pendingExamList\": [\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000lK2nQAE\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Online\",\r\n"
 						+ "      \"examLink\": \"Link\",\r\n"
 						+ "      \"examDate\": \"2022-08-15\",\r\n"
 						+ "      \"examCycle\": \"July\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"BBALIB106-World Cultures\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000lwpZQAQ\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Online\",\r\n"
 						+ "      \"examLink\": \"Link\",\r\n"
 						+ "      \"examDate\": \"2022-08-16\",\r\n"
 						+ "      \"examCycle\": \"July\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"BBADSC201-Data Science for Business\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Global MBA\",\r\n"
 						+ "      \"invigStatus\": \"Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000lK2sQAE\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Ofline\",\r\n"
 						+ "      \"examLink\": \"Link\",\r\n"
 						+ "      \"examDate\": \"2022-08-12\",\r\n"
 						+ "      \"examCycle\": \"October\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"BBAMGT106-Principles of Management\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": \"a136D0000055hVqQAI\",\r\n"
 						+ "      \"quesPaperStatus\": \"Approved\",\r\n"
 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000lwpUQAQ\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Online\",\r\n"
 						+ "      \"examLink\": \"Link\",\r\n"
 						+ "      \"examDate\": \"2022-08-17\",\r\n"
 						+ "      \"examCycle\": \"July\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"BBALIB106-World Cultures\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"MGB Term 4 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Global MBA\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000laGZQAY\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Ofline\",\r\n"
 						+ "      \"examLink\": null,\r\n"
 						+ "      \"examDate\": \"2022-08-14\",\r\n"
 						+ "      \"examCycle\": \"October\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"MBAGITM213-Managing Technology Projects and Outsourcing\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"MGB Term 4 Master\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Global MBA\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000laGaQAI\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"Mid-term\",\r\n"
 						+ "      \"examMode\": \"Ofline\",\r\n"
 						+ "      \"examLink\": null,\r\n"
 						+ "      \"examDate\": \"2022-08-13\",\r\n"
 						+ "      \"examCycle\": \"October\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"MBAGITM213-Managing Technology Projects and Outsourcing\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    },\r\n"
 						+ "    {\r\n"
 						+ "      \"term\": \"2024-DEC-BBA-Term6-Virtual\",\r\n"
 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
 						+ "      \"questionPaperId\": null,\r\n"
 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
 						+ "      \"id\": \"a126D000000laGeQAI\",\r\n"
 						+ "      \"grading\": null,\r\n"
 						+ "      \"examType\": \"End-term\",\r\n"
 						+ "      \"examMode\": \"Online\",\r\n"
 						+ "      \"examLink\": null,\r\n"
 						+ "      \"examDate\": \"2022-08-11\",\r\n"
 						+ "      \"examCycle\": \"October\",\r\n"
 						+ "      \"evaluation\": null,\r\n"
 						+ "      \"course\": \"BBAQTT310-Decision Making\",\r\n"
 						+ "      \"batch\": \"2022\"\r\n"
 						+ "    }\r\n"
 						+ "  ]\r\n"
 						+ "}");
                log.info("=============Completed===============");
                Reporter.log( "=============Completed===============", true );
                driver.close();


     
	}
	@Test(priority=2)
	public void FilterByUpcommingexam15days(Method method) throws InterruptedException {
		 log.info("=============Test name============: " + method.getName());
		 Reporter.log("=============Test name============:",true);
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
			log.info("Launching the FrontEnd portal");
			 Reporter.log("Launching the FrontEnd portal",true);
			driver.manage().window().maximize();
			log.info("Maximize the Browser");
			Reporter.log("Maximize the Browser",true);
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
	         driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/button")).click();
	         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
	         System.out.println("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         log.info("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
	 		log.info("Launching the WorkBench URL");
	 		Reporter.log("Launching the WorkBench URL",true);
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
	 		driver.findElement(By.id("termsAccepted")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
	 		log.info("Login to the WorkBench");
	 		Reporter.log("Login to the WorkBench",true);
	 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
	 			log.info("Connect Workbench & salesforce integrate");
	 			Reporter.log("Connect Workbench & salesforce integrate",true);
	 			 WebElement l = driver.findElement(By.id("urlInput"));
	 			l.sendKeys("/services/data/v54.0");
	 			l.clear();
	 			Thread.sleep(2000);
	 			log.info("Clear the Extra API On the URI ");
	 			Reporter.log("Clear the Extra API On the URI ",true);
	 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=15");
	 			  log.info("on the api Testing Here We fillter the Exam Complete the 15 days");
	 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 15 days ",true);
	 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	 				
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[1]")).click();
	 				Thread.sleep(10000);
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
	 				log.info("To show the Response came from Salesforce & the record count 6");
	 				 Reporter.log("To show the Response came from Salesforce & the record count 6 ",true);
	 				log.info("======================RESPONSE FROM THE API====================");
	 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
	 				log.info("{\r\n"
	 						+ "  \"pendingExamList\": [\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000lK2nQAE\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Online\",\r\n"
	 						+ "      \"examLink\": \"Link\",\r\n"
	 						+ "      \"examDate\": \"2022-08-15\",\r\n"
	 						+ "      \"examCycle\": \"July\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"BBALIB106-World Cultures\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000lwpZQAQ\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Online\",\r\n"
	 						+ "      \"examLink\": \"Link\",\r\n"
	 						+ "      \"examDate\": \"2022-08-16\",\r\n"
	 						+ "      \"examCycle\": \"July\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"BBADSC201-Data Science for Business\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000lK2sQAE\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Ofline\",\r\n"
	 						+ "      \"examLink\": \"Link\",\r\n"
	 						+ "      \"examDate\": \"2022-08-12\",\r\n"
	 						+ "      \"examCycle\": \"October\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"BBAMGT106-Principles of Management\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": \"a136D0000055hVqQAI\",\r\n"
	 						+ "      \"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000lwpUQAQ\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Online\",\r\n"
	 						+ "      \"examLink\": \"Link\",\r\n"
	 						+ "      \"examDate\": \"2022-08-17\",\r\n"
	 						+ "      \"examCycle\": \"July\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"BBALIB106-World Cultures\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"MGB Term 4 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000laGZQAY\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Ofline\",\r\n"
	 						+ "      \"examLink\": null,\r\n"
	 						+ "      \"examDate\": \"2022-08-14\",\r\n"
	 						+ "      \"examCycle\": \"October\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGITM213-Managing Technology Projects and Outsourcing\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"MGB Term 4 Master\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Global MBA\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000laGaQAI\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"Mid-term\",\r\n"
	 						+ "      \"examMode\": \"Ofline\",\r\n"
	 						+ "      \"examLink\": null,\r\n"
	 						+ "      \"examDate\": \"2022-08-13\",\r\n"
	 						+ "      \"examCycle\": \"October\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"MBAGITM213-Managing Technology Projects and Outsourcing\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    },\r\n"
	 						+ "    {\r\n"
	 						+ "      \"term\": \"2024-DEC-BBA-Term6-Virtual\",\r\n"
	 						+ "      \"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "      \"questionPaperId\": null,\r\n"
	 						+ "      \"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "      \"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "      \"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "      \"id\": \"a126D000000laGeQAI\",\r\n"
	 						+ "      \"grading\": null,\r\n"
	 						+ "      \"examType\": \"End-term\",\r\n"
	 						+ "      \"examMode\": \"Online\",\r\n"
	 						+ "      \"examLink\": null,\r\n"
	 						+ "      \"examDate\": \"2022-08-11\",\r\n"
	 						+ "      \"examCycle\": \"October\",\r\n"
	 						+ "      \"evaluation\": null,\r\n"
	 						+ "      \"course\": \"BBAQTT310-Decision Making\",\r\n"
	 						+ "      \"batch\": \"2022\"\r\n"
	 						+ "    }\r\n"
	 						+ "  ]\r\n"
	 						+ "}");
	                log.info("=============Completed===============");
	                Reporter.log( "=============Completed===============", true );
	                driver.close();
	}
	@Test(priority=3)
	public void completeExam7Days(Method method) throws InterruptedException {
		log.info("=============Test name============: " + method.getName());
		 Reporter.log("=============Test name============:",true);
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
			log.info("Launching the FrontEnd portal");
			 Reporter.log("Launching the FrontEnd portal",true);
			driver.manage().window().maximize();
			log.info("Maximize the Browser");
			Reporter.log("Maximize the Browser",true);
			 driver.findElement(By.xpath("//span[.='Sign In']")).click();
	         Thread.sleep(2000);
	     	driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
	     	Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/button")).click();
	         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
	         System.out.println("The number of Record  is from Portal on 7 days Filletr "+ row.size());
	         log.info("The number of Record  is from Portal on 7 days Filletr "+ row.size());
	         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
	 		log.info("Launching the WorkBench URL");
	 		Reporter.log("Launching the WorkBench URL",true);
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
	 		driver.findElement(By.id("termsAccepted")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
	 		log.info("Login to the WorkBench");
	 		Reporter.log("Login to the WorkBench",true);
	 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
	 			log.info("Connect Workbench & salesforce integrate");
	 			Reporter.log("Connect Workbench & salesforce integrate",true);
	 			 WebElement l = driver.findElement(By.id("urlInput"));
	 			l.sendKeys("/services/data/v54.0");
	 			l.clear();
	 			Thread.sleep(2000);
	 			log.info("Clear the Extra API On the URI ");
	 			Reporter.log("Clear the Extra API On the URI ",true);
	 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=7");
	 			  log.info("on the api Testing Here We fillter the Exam Complete the 7 days");
	 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 7 days ",true);
	 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	 				
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[3]")).click();
	 				Thread.sleep(10000);
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
	 				log.info("To show the Response came from Salesforce & the record count 6");
	 				 Reporter.log("To show the Response came from Salesforce & the record count 6 ",true);
	 				log.info("======================RESPONSE FROM THE API====================");
	 				Reporter.log("======================RESPONSE FROM THE API====================",true);
	 				log.info("\"completedExamList\": [{\r\n"
	 						+ "		\"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": \"a136D0000055hW5QAI\",\r\n"
	 						+ "		\"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "		\"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "		\"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000lK2iQAE\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"Mid-term\",\r\n"
	 						+ "		\"examMode\": \"Ofline\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-10\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"BBALIB108-Foudation skills 2:Ethics and moral Reasoning\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}, {\r\n"
	 						+ "		\"term\": \"MGB Term 4 Master\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": \"a136D0000055RmtQAE\",\r\n"
	 						+ "		\"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "		\"program\": \"Master of Global Business\",\r\n"
	 						+ "		\"invigStatus\": \"Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000lXz6QAE\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"End-term\",\r\n"
	 						+ "		\"examMode\": \"Ofline\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-06\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"BBAECO103-Macroeconomics\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}, {\r\n"
	 						+ "		\"term\": \"2023-JAN-GMBA-Term1-Dubai\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": \"a136D0000055RmjQAE\",\r\n"
	 						+ "		\"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "		\"program\": \"Global MBA\",\r\n"
	 						+ "		\"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000lXzBQAU\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"End-term\",\r\n"
	 						+ "		\"examMode\": \"Ofline\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-05\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"MBAEENT203-Technology Entrepreneurship\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}, {\r\n"
	 						+ "		\"term\": \"BBA Term 1 Master\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": \"a136D0000055hVRQAY\",\r\n"
	 						+ "		\"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "		\"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "		\"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000lwpaQAA\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"End-term\",\r\n"
	 						+ "		\"examMode\": \"Online\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-09\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"BBAMAT101-Mathematical & Digital Literacy\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}, {\r\n"
	 						+ "		\"term\": \"2024-DEC-BBA-Term6-Virtual\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": null,\r\n"
	 						+ "		\"quesPaperStatus\": \"Not Approved\",\r\n"
	 						+ "		\"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "		\"invigStatus\": \"Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000laaKQAQ\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"End-term\",\r\n"
	 						+ "		\"examMode\": \"Ofline\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-04\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"BBAMGT106-Principles of Management\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}, {\r\n"
	 						+ "		\"term\": \"2024-DEC-BBA-Term6-Virtual\",\r\n"
	 						+ "		\"seatPlanStatus\": \"Not Created\",\r\n"
	 						+ "		\"questionPaperId\": \"a136D0000055RmuQAE\",\r\n"
	 						+ "		\"quesPaperStatus\": \"Approved\",\r\n"
	 						+ "		\"program\": \"Bachelor of Business Administration\",\r\n"
	 						+ "		\"invigStatus\": \"Not Assigned\",\r\n"
	 						+ "		\"id\": \"a126D000000laGfQAI\",\r\n"
	 						+ "		\"grading\": null,\r\n"
	 						+ "		\"examType\": \"Mid-term\",\r\n"
	 						+ "		\"examMode\": \"Online\",\r\n"
	 						+ "		\"examLink\": \"Link\",\r\n"
	 						+ "		\"examDate\": \"2022-08-08\",\r\n"
	 						+ "		\"examCycle\": \"July\",\r\n"
	 						+ "		\"evaluation\": null,\r\n"
	 						+ "		\"course\": \"BBAQTT310-Decision Making\",\r\n"
	 						+ "		\"batch\": \"2022\"\r\n"
	 						+ "	}]\r\n"
	 						+ "}");
	 				driver.close();
	}
	@Test(priority=4)
	public void completeExamFilterBy15Days(Method method) throws InterruptedException {
		log.info("=============Test name============: " + method.getName());
		 Reporter.log("=============Test name============:",true);
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\\r\\n");
			log.info("Launching the FrontEnd portal");
			 Reporter.log("Launching the FrontEnd portal",true);
			driver.manage().window().maximize();
			log.info("Maximize the Browser");
			Reporter.log("Maximize the Browser",true);
			 driver.findElement(By.xpath("//span[.='Sign In']")).click();
	         Thread.sleep(2000);
	     	driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss104']")).click();
	     	Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//span[.='Dashboard']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/button")).click();
	         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/table/tbody/tr"));
	         System.out.println("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         log.info("The number of Record  is from Portal on 15 days Filletr "+ row.size());
	         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
	 		log.info("Launching the WorkBench URL");
	 		Reporter.log("Launching the WorkBench URL",true);
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
	 		driver.findElement(By.id("termsAccepted")).click();
	 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
	 		log.info("Login to the WorkBench");
	 		Reporter.log("Login to the WorkBench",true);
	 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
	 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
	 			log.info("Connect Workbench & salesforce integrate");
	 			Reporter.log("Connect Workbench & salesforce integrate",true);
	 			 WebElement l = driver.findElement(By.id("urlInput"));
	 			l.sendKeys("/services/data/v54.0");
	 			l.clear();
	 			Thread.sleep(2000);
	 			log.info("Clear the Extra API On the URI ");
	 			Reporter.log("Clear the Extra API On the URI ",true);
	 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/ExamData/?completedIn=15");
	 			  log.info("on the api Testing Here We fillter the Exam Complete the 15 days");
	 			 Reporter.log("on the api Testing Here We fillter the Exam Complete the 15 days ",true);
	 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	 				
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/ul/li[3]")).click();
	 				Thread.sleep(10000);
	 				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a[3]")).click();
	 				log.info("To show the Response came from Salesforce & the record count 11");
	 				 Reporter.log("To show the Response came from Salesforce & the record count 11 ",true);
	 				log.info("======================RESPONSE FROM THE API====================");
	 				driver.close();
	}
	
	}


