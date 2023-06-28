package testLayer;


	
	

	import java.util.concurrent.TimeUnit;

    import org.testng.annotations.BeforeMethod;

     import basePackage.Baseclass;
     import pompackage.CustHomePage;
     import pompackage.LoginPOM;
     import pompackage.PasswordPOM;
     import pompackage.SigninPOM;

	public class YourOrderTestCase extends Baseclass{
		LoginPOM lp;
		SigninPOM sign;
		PasswordPOM pass;
		CustHomePage custPage;
		
		public YourOrderTestCase() {
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
		
		
	}


