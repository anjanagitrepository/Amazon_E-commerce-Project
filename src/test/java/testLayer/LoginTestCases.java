package testLayer;

	import org.testng.Assert;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	
    import basePackage.Baseclass;
    import pompackage.LoginPOM;


	public class LoginTestCases extends Baseclass{

		LoginPOM lp;
		
		public LoginTestCases() {
			super();
		}
		
		@BeforeTest
		public void initSetup() throws InterruptedException {
			setup();
		}
		
		
		
		@Test
		public void openSignInPage() {
			lp= new LoginPOM();
			
			lp.goTosignInPage();
		}
		
		@Test
		public void openSignUPPage() {
			lp = new LoginPOM();
			lp.goTosignUPPage();
		}
		
		@AfterTest
		public void windUP() {
			driver.close();
		}
		
	}


