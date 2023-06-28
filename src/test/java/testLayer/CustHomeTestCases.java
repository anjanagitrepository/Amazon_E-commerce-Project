package testLayer;

	


	import java.io.PrintStream;

    import java.util.concurrent.TimeUnit;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	
    import basePackage.Baseclass;
    import pompackage.CustHomePage;
    import pompackage.LoginPOM;
    import pompackage.PasswordPOM;
    import pompackage.SigninPOM;

	public class CustHomeTestCases extends Baseclass{

		LoginPOM lp;
		SigninPOM sign;
		PasswordPOM pass;
		CustHomePage custPage;
		
		public CustHomeTestCases() {
			super();
		}
		
		@BeforeMethod
		public void intiate() throws InterruptedException {
			setup();
			Thread.sleep(2000);
			lp = new LoginPOM();
			lp.goTosignInPage();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sign = new SigninPOM();
			sign.typeEmail(prop.getProperty("username"));
			
		
			
			pass=new PasswordPOM();
			pass.typePassword(prop.getProperty("password"));
		
		}
		
		@Test
		public void openHomePage() {
			custPage = new CustHomePage();
			custPage.gotoYourAccount();
			
			String actUrl = driver.getCurrentUrl();
			System.out.println(actUrl);
			String expUrl = "https://www.amazon.ca/gp/css/homepage.html?ref_=na v_youraccount_btn";
			Assert.assertEquals(actUrl, expUrl);
		}
		
		@AfterMethod
		
		
		public void shutDown() {
			driver.close();
		
		
		}
		
	}
	


