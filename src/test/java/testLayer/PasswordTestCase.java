package testLayer;

	
	

	import org.testng.Assert;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	
     import basePackage.Baseclass;
     import pompackage.LoginPOM;
     import pompackage.PasswordPOM;
     import pompackage.SigninPOM;

	

	public class PasswordTestCase extends Baseclass {

		LoginPOM lp;
		SigninPOM sign;
		PasswordPOM pass;
		
		public PasswordTestCase() {
			super();
		}
		
		@BeforeSuite
		public void intiate() {
			setup();
		}
		
		@BeforeTest
		public void openSignPagr() {
			
			lp = new LoginPOM();
			lp.goTosignInPage();
			
			sign = new SigninPOM();
			sign.typeEmail(prop.getProperty("username"));
		}
		
			
			
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}
		
		
}
