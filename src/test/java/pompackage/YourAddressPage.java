package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class YourAddressPage extends Baseclass {

	@FindBy (xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a") WebElement yourOrders;
	@FindBy (xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a") WebElement yourAddress;
	
	
	public YourAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public YourOrdersPage goToOrderPage() {
		yourOrders.click();
		return new YourOrdersPage();
	}
	
	public YourOrdersPage goToAddressesPage() {
		yourAddress.click();
		return new YourOrdersPage();
	}

	public void clickOnAddAddress() {
		// TODO Auto-generated method stub
		
	}
	
	
}




