package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class asserationsClass extends pageBase {
	public asserationsClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "total-sum")
	WebElement sum;
	
	public String return_total() {
 return sum.getText();
	
}
}
