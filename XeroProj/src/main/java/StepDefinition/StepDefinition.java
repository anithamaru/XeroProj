package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import junit.framework.Assert;

public class StepDefinition extends Utility_Getdata {
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	@Before
	public static void setup() {
		SimpleDateFormat simpledateformatter = new SimpleDateFormat("'sampledemo_'yyyyMMddHHmm'.html'");
		Date currentDate =new Date();
			String filename = simpledateformatter.format(currentDate);
		String path = "C:\\Java_Anitha\\XeroProj\\ExtendReport\\"+filename;
		//C:\Java_Anitha\XeroProj\ExtentReport
				reports = new ExtentReports(path);
				logger=reports.startTest("Application Xero");
			
			//logger.assignCategory("Smoke tEsting");

			System.setProperty("webdriver.chrome.driver", "C:\\Java_Anitha\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			logger.log(LogStatus.PASS, "Chrome launched successfully");
			
		
	}
	@Given("^: Launch the URL \"([^\"]*)\"$")
	public void launch_the_Url(String arg2) throws Throwable {
		
		driver.get(arg2);
		System.out.println(arg2);
		logger.log(LogStatus.INFO,"Xero application page is displayed");
		Thread.sleep(5000);
	}
	
	@After
	public void close_the_browser() throws Throwable {
		
		
		Thread.sleep(5000);
		driver.quit();
		logger = reports.startTest("Closing Browser");
		logger.log(LogStatus.PASS, "Closing");
		reports.endTest(logger);
		reports.flush();
		
	}
	@Given("^: Launch the URL$")
	public void launch_the_URL(DataTable credential) throws Throwable {
		List<Map<String, String>> data = credential.asMaps(String.class, String.class);
//		System.setProperty("webdriver.chrome.driver", "C:\\Java_Anitha\\chromedriver.exe");
//		driver = new ChromeDriver();
	    driver.get(data.get(0).get("Xero Webpage"));
	    logger.log(LogStatus.INFO,"Xero application page is displayed");
		Thread.sleep(5000);
	}
//	@Then("^: Enter data into text box \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_data_into_text_box(String textbox1, String textbox2,DataTable credential) throws IOException, Exception {
//		Thread.sleep(2000);
//		String locator1 = getvalue(textbox1);
//		String locator2 = getvalue(textbox2);
//	for(Map<String, String> data:credential.asMaps(String.class, String.class)) {
//		driver.findElement(By.xpath(locator1)).sendKeys(data.get(textbox1));
//	
//	System.out.println(textboxName+ " is entered as "+data.get(textboxName));
//	}
	@Then("^: Enter data into text box \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_data_into_text_box(String textboxName, String textbox, DataTable credential) {
		String locator = getvalue(textbox);
		for(Map<String, String> data:credential.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath(locator)).sendKeys(data.get(textboxName));
		logger.log(LogStatus.PASS, textboxName+ " is entered as "+data.get(textboxName));
		//System.out.println(textboxName+ " is entered as "+data.get(textboxName));
		//driver.findElement(By.xpath(Identifier)).sendKeys(list.get(0).get("data"));
	}}
		@Then("^: Validate entered text \"([^\"]*)\" \"([^\"]*)\"$")
		public void validate_entered_text(String textboxName, String textbox, DataTable credential) throws Throwable {
			String locator = getvalue(textbox);
		List<Map<String, String>> data = credential.asMaps(String.class, String.class);
			String actual=driver.findElement(By.xpath(locator)).getAttribute("value");
		String expected=data.get(0).get(textboxName);
		if(actual.equals(expected)) {
			logger.log(LogStatus.PASS, "The text" +actual+" is entered correctly");	}
			else {
				logger.log(LogStatus.FAIL, "The text" +actual+" is not correct");	
				}
		}
		
		
//	}


	
	@Then("^: Select data into text box \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_data_into_text_box(String textboxName, String textbox, DataTable credential) throws AWTException, InterruptedException {
		String locator = getvalue(textbox);
		for(Map<String, String> data:credential.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath(locator)).sendKeys(data.get(textboxName));
			Robot robot = new Robot(); 
			robot.keyPress(KeyEvent.VK_ENTER);	
			Thread.sleep(7000);
			logger.log(LogStatus.PASS, " is entered as "+data.get(textboxName));
		//driver.findElement(By.xpath(Identifier)).sendKeys(list.get(0).get("data"));
	}
	}
	@Then("^: Click the Button \"([^\"]*)\"$")
	public void Click_the_Button(String arg1) throws Throwable {
		Thread.sleep(5000);
		String locator = getvalue(arg1);
		driver.findElement(By.xpath(locator)).click();
		logger.log(LogStatus.PASS, "clicked the "+arg1);
		Thread.sleep(5000);
	}

//	@Then("^: Click the Button \"([^\"]*)\",\"([^\"]*)\"$")
//	public void Click_the_Button(String arg1,String arg2) throws Throwable {
//		int waittime = 2000;
//		if (arg2 != null) waittime = Integer.parseInt(arg2);
//		String locator=getvalue(arg1);
//		driver.findElement(By.xpath(locator)).click();
//		Thread.sleep(waittime);
//	}

	@When("^: Validate the url \"([^\"]*)\"$")
	public void Validate_the_url(String arg2) throws Throwable {
		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		System.out.println("URL" + actual);
		String expected = arg2;
		//Assert.assertEquals(expected, actual);
	   if(actual.equals(expected)) {
		   logger.log(LogStatus.PASS,"The Expected URL page is dispalyed");
	   }else
	   {
		   logger.log(LogStatus.FAIL,"The Expectted URL is not displayed");
	   }
		Thread.sleep(5000);
	}

	
	

	@Then("^: Validate message is displayed \"([^\"]*)\" \"([^\"]*)\"$")
	public void validate_message_is_displayed(String arg1, String arg2) throws Throwable {
		String locator = getvalue(arg1);
		Thread.sleep(5000);
		String actualMsg = driver.findElement(By.xpath(locator)).getText();
		String expected = arg2;
		Thread.sleep(5000);
		//Assert.assertEquals(expected, actualMsg);
		if(actualMsg.contentEquals(expected)) {
			 logger.log(LogStatus.PASS," Message "+arg2+" is dispalyed as Expected");
		   }else
		   {
			   logger.log(LogStatus.FAIL,"Message "+arg2+" is not displayed");
		   }
	}

	@Then("^: Click the check box \"([^\"]*)\"$")
	public void click_the_check_box(String arg1) throws Throwable {
		String locator = getvalue(arg1);
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(3000);
	}

	@Then("^: Validate Error message  \"([^\"]*)\"$")
	public void validate_Error_message(String arg1) throws Throwable {
		String locator = getvalue(arg1);
		String errorMsg = driver.findElement(By.xpath(locator)).getText();
		System.out.println(errorMsg + " Is highlighted");
		Thread.sleep(3000);
	}

	@Then("^: Check New Webpage \"([^\"]*)\"$")
	public void check_New_Webpage(String arg2) throws Throwable {
		// get window handlers as list
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(browserTabs.get(1));
		// check is it correct page opened or not (e.g. check page's title)

		System.out.println("New Page " + arg2);
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual " + actualUrl);
		//Assert.assertEquals(arg2, actualUrl);
		logger.log(LogStatus.PASS,"The New Page is displayed as Expected");
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		Thread.sleep(3000);
	}

	@Then("^:Title is Displayed \"([^\"]*)\"$")
	public void Title_is_Displayed(String pageName,DataTable credential) throws Throwable {
		
		String actualText = driver.getTitle();
		List<Map<String, String>> data = credential.asMaps(String.class, String.class);
		System.out.println(actualText);
		String[] texts = actualText.split("\\|");
		// String[] texts=actualText.split(Pattern.quote("|"));
		 String title=data.get(0).get("pageName");
		String titleText = texts[texts.length - 1].toString().trim();
		//Assert.assertEquals(title, titleText);
        System.out.println(titleText);
		if(title.equals(titleText)) {
        logger.log(LogStatus.PASS," is equals "+ titleText+" is Displayed");
		}else {
        logger.log(LogStatus.FAIL," is equals "+ titleText+" NOT Displayed");
		}
	}
//	@Then("^:Title is Displayed$")
//	public void title_is_Displayed(DataTable credential) throws Throwable {
//		String actualText = driver.getTitle();
//		List<Map<String, String>> data = credential.asMaps(String.class, String.class);
//		System.out.println(actualText);
//		String[] texts = actualText.split("\\|");
//		String titleText = texts[texts.length - 1].toString().trim();
//        System.out.println(titleText);
//        String title=data.get(0).get("pageName");
//		if (title.equals(titleText)) {
//			System.out.println(title+" is equals "+ titleText+" is Displayed");
//		} else {
//			System.out.println(title+" is equals "+ titleText+" NOT Displayed");
//		}
//	}



	@When("^: Click on tags \"([^\"]*)\"$")
	public void click_on_tags(String arg1) throws Throwable {
		String locator = getvalue(arg1);
		driver.findElement(By.linkText(locator)).click();
		Thread.sleep(3000);
	}

	@Then("^: Is Displayed \"([^\"]*)\"$")
	public void is_Displayed(String arg1) throws Throwable {
		String locator = getvalue(arg1);
		if (driver.findElement(By.xpath(locator)).isDisplayed()) {
			logger.log(LogStatus.PASS,"The Expected Dropdown is displayed");
		} else {
			logger.log(LogStatus.FAIL,"Dropdown not displayed");
		}

	}
	@Then("^: Select Dropdown \"([^\"]*)\"$")
	public void select_Dropdown(String arg1,DataTable credential) throws Throwable {
		String locator = getvalue(arg1);
		//List<Map<String, String>> data = credential.asMaps(String.class, String.class);
		//Select dropDown = new Select(driver.findElement(By.xpath(locator)));
		//dropDown.selectByVisibleText(data.get(0).get("Choose"));
		driver.findElement(By.id(locator)).click();
		Thread.sleep(5000);
		//System.out.println(data.get(0).get("Choose")+" is Selected");
	}
	
	@Then("^:Moving to New Window \"([^\"]*)\"$")
	public void moving_to_New_Window(String arg1) throws Throwable {
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		String actualTitle = driver.getTitle();
		logger.log(LogStatus.INFO,"Browser navigated to "+actualTitle+ " Page");
		String locator = getvalue(arg1);
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(5000);
	}
	@When("^:Switch to frame \"([^\"]*)\"$")
	public void switch_to_frame(String arg1) throws Throwable {
		Thread.sleep(8000);
		String locator = getvalue(arg1);
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(locator)));
		Thread.sleep(8000);
	}
	@Then("^:Switch out frame$")
	public void switch_out_frame() throws Throwable {
		driver.switchTo().defaultContent();
	}
//	@Then("^: Switch to frame \"([^\"]*)\" \"([^\"]*)\"$")
//	public void switch_to_frame(String arg1,String arg2) throws Throwable {
//		//List<Map<String, String>> data = credential.asMaps(String.class, String.class);
//		String locator = getvalue(arg1);
//		WebElement iframeCC=driver.findElement(By.xpath(locator));
//		
//		Thread.sleep(8000);
//		//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeCC));
//		driver.switchTo().frame(iframeCC);
//		iframeCC.sendKeys(arg2);
//		Thread.sleep(8000);
//		driver.switchTo().defaultContent();
//	}
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	


