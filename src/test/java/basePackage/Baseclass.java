package basePackage;

import java.io.FileNotFoundException;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.TimeUtils;










//browser
// url
//username and password

public class Baseclass {

	public static Properties prop= new Properties();
	
	public static WebDriver driver;
	
	
	public void BaseLoginClass() throws FileNotFoundException {
		
		try	{
			FileInputStream file = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\AmazonProject\\environmentvariables\\Config.properties");
			
				prop.load(file);
			} 
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); }
			
		}
	
	
public static void setup() {
		
		String browserName = prop.getProperty("browserName");
		
		if(browserName.equals("Chrome")) {
			
		    System.setProperty("webdriver.chrome.driver","chrome.exe");
			
			WebDriverManager.chromedriver().setup();
		
			driver = new ChromeDriver();
		}
			
		
		else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timpage, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	
	
	
}
	
	
	
	
}
