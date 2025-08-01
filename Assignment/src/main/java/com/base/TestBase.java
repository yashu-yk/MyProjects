 package  com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class TestBase {

//	public static WebDriver driver;
	public ThreadLocal <WebDriver> driver=new ThreadLocal<>();
	public static Properties properties;

	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}
	
	public WebDriver getDriver() {
		return this.driver.get();
	}
	
	public TestBase() 
	{
		try 
		{
			 properties = new Properties();
	         FileInputStream fileInput = new FileInputStream("C:\\Users\\ujjwa\\OneDrive\\Desktop\\TestProjects\\MySelenium\\Assignment\\src\\main\\java\\com\\configuration\\conf.properties");
			 properties.load(fileInput);
			
		} catch(FileNotFoundException e) 
		
		{ 
			e.printStackTrace();
		
		} catch(IOException e) 
		
		{
			e.printStackTrace();
		}
	}
	
	public  void initialization(String browser) {
		 WebDriverManager.chromedriver().setup();
	     WebDriverManager.firefoxdriver().setup();

		 
		try {
		if(browser.equals("chrome")) {
			setDriver(new ChromeDriver());
		}
		else if(browser.equals("firefox")){
			setDriver(new FirefoxDriver());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); 
		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ) ;
		getDriver().get(properties.getProperty("url"));

	}
	
}
