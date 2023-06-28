package testLayer;





	import org.testng.annotations.AfterMethod;

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	
	import basePackage.Baseclass;
    import pompackage.CreateAccountPOM;
    import pompackage.LoginPOM;

	public class CreateAccountTestCases extends Baseclass{

		LoginPOM lp;
		CreateAccountPOM crtAcc;
		
		public CreateAccountTestCases() {
			super();
		}
		
		@BeforeMethod
		public void intiate() {
			setup();
			lp =new LoginPOM();
			lp.goTosignUPPage();
		}
		
		
		@Test(priority = 1)
		public void validName() {
			
			crtAcc = new CreateAccountPOM();
			//crtAcc.testCreatePage();
			crtAcc.typeYourName("Anjana");
		}
		
		@Test
		public void validPhoneOREmail() {
			crtAcc = new CreateAccountPOM();
			crtAcc.typePhoneOREmail("6477869484");
		}
		
		@Test(priority = 2)
		public void validPassword() {
			crtAcc = new CreateAccountPOM();
			crtAcc.typePasswprd("Anjana7$");
		}
		
		@Test(priority = 3)
		public void validPasswordAgain() {
			crtAcc = new CreateAccountPOM();
			crtAcc.typePasswordAgain("Parth123");
		
		
	}
	
	
	
}
