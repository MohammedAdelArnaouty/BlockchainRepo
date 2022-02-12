package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
	public pageBase (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
