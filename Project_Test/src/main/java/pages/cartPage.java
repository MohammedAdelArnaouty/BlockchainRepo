package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends pageBase {

	public cartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath = "//button[@data-hook='CheckoutButtonDataHook.button']")
	
	WebElement check_out;
	
	public void click_on_check_out() {
		check_out.click();
			}
	
	@FindBy (xpath = "//button[@class='_2Iz_Q']")
	WebElement got_it;

	public void got_it_button() {
	got_it.click();
	}

}
