package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.Baseclass;

public class CustHomePage extends Baseclass{

	@FindBy(xpath="//*[@id='nav-link-accountList']") WebElement custAccount;
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]") WebElement yourAccount;
	
	Actions action;
	
	public CustHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public YourAccountPage gotoYourAccount() {
		/*action = new Actions(driver);
		action.moveToElement(custAccount).build().perform();*/
		
		custAccount.click();
		return new YourAccountPage();
	}
	
	
}


