package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase {

	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//*[@id=\"comp-iy4cwgmq1label\"]") 
	WebElement shop_link;  
	
	public void click_shop() {
		shop_link.click();
	}

	@FindBy(xpath="//*[@id=\"TPASection_j4ci4xl4\"]/div/div/div/div/section/div/ul/li[4]/div")
	WebElement fourth_product;

	public void choose_product() {
		fourth_product.click();
	}
}
