package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testBase {
public static WebDriver driver;
	
	@BeforeTest
	public void open_driver() {
	 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 driver.navigate().to("https://arielkiell.wixsite.com/interview");
	 driver.manage().window().maximize();
     }	
	
    public void sleeps(int seconds) throws InterruptedException {
	 Thread.sleep(seconds);
	 } 

    @AfterTest
    public void browser_close() {
	 driver.close();
     }

}
