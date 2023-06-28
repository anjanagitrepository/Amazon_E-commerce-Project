package testLayer;



	import java.util.concurrent.TimeUnit;


    import org.apache.commons.math3.analysis.function.Logit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	

	

    import basePackage.Baseclass;
    import pompackage.AddAddressPage;
    import pompackage.CustHomePage;
    import pompackage.LoginPOM;
    import pompackage.PasswordPOM;
    import pompackage.SigninPOM;
    import pompackage.YourAccountPage;
    import pompackage.YourAddressPage;

	




	public class AddAddressTestCases  extends Baseclass{

		LoginPOM lp;
	    SigninPOM sign;
		PasswordPOM pass;
		CustHomePage custPage;
		YourAccountPage yourAccPage;
		YourAddressPage yourAddress;
		AddAddressPage addNewAddress;
		
		public AddAddressTestCases() throws InterruptedException {
			super();
			//Thread.sleep(5000);
		}
		
		@BeforeTest
		public void intiate() throws InterruptedException {
			setup();
			Thread.sleep(3000);
			lp = new pompackage.LoginPOM();
			lp.goTosignInPage();
         	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sign = new pompackage.SigninPOM();
			sign.typeEmail(prop.getProperty("username"));
			
		
			
			pass=new PasswordPOM();
			pass.typePassword(prop.getProperty("password"));
			
		}
		
		@BeforeMethod
		public void testOpenAddAddressPage() {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			custPage = new pompackage.CustHomePage();
			custPage.gotoYourAccount();
			
			yourAccPage = new pompackage.YourAccountPage();
			yourAccPage.goToAddressesPage();
			
			yourAddress = new YourAddressPage();
			 yourAddress.clickOnAddAddress();
		}
		
		@Test
		public void testAddressFieldsWithValidData() {
			
			addNewAddress = new AddAddressPage();
			addNewAddress.validfullName("ABCD");
			addNewAddress.validphoneNum("1234567890");
			addNewAddress.validAddressLine01("1 Earlton Road");
			addNewAddress.validCity("Scarborough");
			addNewAddress.selectValidProvince("Ontario");
			addNewAddress.validPostalCode("M1T2R2");
			addNewAddress.clickOnAddAddressbtn();
		}
		
	
		
		
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}
		
	}
	
	
	
	
	
	
	
	
	

