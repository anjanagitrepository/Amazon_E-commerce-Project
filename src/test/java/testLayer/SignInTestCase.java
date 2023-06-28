package testLayer;


	


	import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

    import basePackage.Baseclass;
    import pompackage.LoginPOM;
    import pompackage.SigninPOM;

	public class SignInTestCase extends Baseclass{

		LoginPOM lp;
		SigninPOM sign;
		
		public SignInTestCase() {
			super();
		}
		
		@BeforeTest
		public void intiate(){
			setup();
			lp= new LoginPOM();
			lp.goTosignInPage();
		}
		
		@Test
		public void validUserName(){
			
			sign = new SigninPOM();
			
			
			sign.typeEmail(prop.getProperty("username"));
			String actURL = driver.getCurrentUrl();
			String expURL = "https://www.amazon.ca/ap/signin";
			Assert.assertEquals(actURL, expURL);
		}
		
		
		
		@AfterTest
		public void closeBrowser() {
			driver.close();
		}
		
	}


