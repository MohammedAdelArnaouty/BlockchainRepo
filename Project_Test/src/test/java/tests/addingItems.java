package tests;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.asserationsClass;
import pages.cartPage;
import pages.homePage;
import pages.iamProductPage;
import pages.takeScreenshot;

public class addingItems extends testBase{
	homePage home_object;
	iamProductPage product_object;
	cartPage cart_object;
	asserationsClass assertions_object;
	takeScreenshot screenshot_object = new takeScreenshot();
	
	@Test ()
	public void add_items() throws InterruptedException {
		home_object = new homePage(driver);
		
		home_object.click_shop();
		screenshot_object.take_screen_shot(driver, "1-go to the shop");
		home_object.choose_product();
		screenshot_object.take_screen_shot(driver, "2-select 4th product (counting from top left to button right)");
		sleeps(4000);
		}
	

	public void product_steps() throws InterruptedException {
		product_object = new iamProductPage(driver);
	    
		product_object.mouse_movement();
	    screenshot_object.take_screen_shot(driver, "3-add to cart 3 items using the up arrow");
		product_object.click_up_arrow();
		product_object.click_up_arrow();
		screenshot_object.take_screen_shot(driver, "4-add to cart 3 items using the up arrow");
		sleeps(3000);
		product_object.change_color();
		screenshot_object.take_screen_shot(driver, "5-pick any color (black)");
		sleeps(2000);
		product_object.add_to_cart_button();
		screenshot_object.take_screen_shot(driver, "6-add to cart button");
		sleeps(5000);
		driver.switchTo().frame(1);
		product_object.view_cart_button();
		screenshot_object.take_screen_shot(driver, "7-click on view cart");
		sleeps(10000);
	    }
	
	
	public void cart_steps() throws InterruptedException {
		cart_object = new cartPage(driver);
		//sleeps(10000);
		//driver.switchTo().frame(1);
		driver.switchTo().parentFrame();
		 //sleeps(10000);
		 cart_object.click_on_check_out();
		 screenshot_object.take_screen_shot(driver, "8-click on checkout");
	     sleeps(3000);
	     //driver.switchTo().parentFrame();
		 driver.switchTo().frame(2);
		 screenshot_object.take_screen_shot(driver, "9-got_it_button");
		 cart_object.got_it_button();
		 }
	

	public void cheking_price_step() throws InterruptedException {
		 assertions_object = new asserationsClass(driver);
		 
		 driver.switchTo().parentFrame();
		 screenshot_object.take_screen_shot(driver, "10 -check that the price adds up to 75 CAD");
		 String return_total=
		 assertions_object.return_total();
		 assertEquals(return_total, "C$75.00");
         }
}
