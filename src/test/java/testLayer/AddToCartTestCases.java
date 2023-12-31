package testLayer;





	import java.util.concurrent.TimeUnit;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

    import basePackage.Baseclass;
    import pompackage.AddToCartPage;
    import pompackage.CustHomePage;
    import pompackage.LoginPOM;
    import pompackage.PasswordPOM;
    import pompackage.SigninPOM;

	

	public class AddToCartTestCases extends Baseclass{

		LoginPOM lp;
		SigninPOM sign;
		PasswordPOM pass;
		AddToCartPage addToCart;
		
		public AddToCartTestCases() {
			super();
		}
		
		@BeforeTest
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
		
		@BeforeMethod
		public void testProduct() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			addToCart = new AddToCartPage();
			addToCart.typeProductName("Java Book");
		}
		
		@Test
		public void testSelProduct() {
			
			addToCart.selectProduct();
			addToCart.addInCart();
		}
		
		@AfterMethod
		public void windUP() {
			driver.close();
		}
		
		
	}
		
		