package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iamProductPage extends pageBase {

	public iamProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (css = "div._2uERl")
	WebElement count;

	public void mouse_movement() {
	count.click();
	}
	
	@FindBy (css = "span._11lkb")
	WebElement up_arrow;

	public void click_up_arrow() {
	up_arrow.click();
		
	}
	@FindBy(xpath = "//div[@data-tooltip-hook='color-picker-item-tooltip'][1]")
	WebElement color_choose;
	
	public void change_color() {
		color_choose.click();
	}
	
	@FindBy (xpath = "//*[@id=\"TPAMultiSection_j4ci4xqb\"]/div/div/article/div[1]/div/article/section[2]/div[7]/div[2]/button/span")
	WebElement add_to_cart;

	public void add_to_cart_button() {
	add_to_cart.click();
		
	}
	
	@FindBy (id = "widget-view-cart-button")
	WebElement view_cart;

	public void view_cart_button() {
	view_cart.click();
	}

}
