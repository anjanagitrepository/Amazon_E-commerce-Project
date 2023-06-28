package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.Baseclass;

public class YourOrdersPage extends Baseclass{
	
	@FindBy (xpath="//*[contains(text(),'Cancelled Orders')]") WebElement cancelledOrder;
	@FindBy (xpath="//*[contains(text(),'Not Yet Shipped')]") WebElement notShippedOrders;
	@FindBy (xpath="//*[contains(text(),'But Again')]") WebElement buyAgainOrders;
	
	public YourOrdersPage() {
		PageFactory.initElements(driver, this); 
	
	}
}
	

	
	
	
	





