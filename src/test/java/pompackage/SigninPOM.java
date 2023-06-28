package pompackage;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.Baseclass;

public class SigninPOM extends Baseclass{
	
	@FindBy(xpath="//input[@id='ap_email']") WebElement email;
	@FindBy(xpath="//input[@id='continue']") WebElement cntbtn;
	
	
	public SigninPOM() {
		PageFactory.initElements(driver, this);
	}
	
	public void testSignPage() {
		System.out.println("Sign in page loaded...");
	}
	
	public PasswordPOM typeEmail(String useremail) {
		email.sendKeys(useremail);
		cntbtn.click();
		return new PasswordPOM();
	}

}