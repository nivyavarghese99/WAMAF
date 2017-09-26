package stepDefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SmokeTest {
    

    WebDriver driver;
	private String baseUrl;
    
    
    @Given("^Open firefox and start application$")
    
    
    public void open_firefox_and_start_application() throws Throwable {
        
        
        
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("http://www.flipkart.com");

      }

        
       
    
    
@When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        
        //driver.get("http://www.flipkart.com");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
        
    }



@When("^I enter valid username and password$")
public void i_enter_valid_username_and_valid_password() throws Throwable {
    
    //driver.findElement(By.xpath("//input[@value='9496616082']")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9496616082");
    
    
    
   // driver.findElement(By.xpath("//input[@value='qwerty123456']")).clear();
    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("qwerty123456");


}

@Then("^user should be able to login successfully$")

public void user_should_be_able_to_login_successfully() throws Throwable {
    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

   
}

@When("^I click on Sell on Flipkart$") 
public void I_click_on_Sell_on_Flipkart() throws Throwable {
	//driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Sell on Flipkart")).click();
    

}

@Then("^Check whether it navigates to seller.flipkart page$") 
public void Check_whether_it_navigates_to_seller_flipkart_page() throws Throwable {
	driver.get(baseUrl + "/");
    
	driver.findElement(By.linkText("Sell on Flipkart")).click();
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    
	driver.get("http://www.flipkart.com");
}
	/*driver.findElement(By.linkText("Advertise")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	//driver.findElement(By.cssSelector("img[alt=\"Flipkart\"]")).click();
	
driver.findElement(By.linkText("Gift Card")).click();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
	driver.findElement(By.linkText("Download App")).click();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");

    driver.findElement(By.linkText("Track Order")).click();
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");

    driver.findElement(By.linkText("Account")).click();
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
    driver.findElement(By.linkText("Wallet")).click();
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
    driver.findElement(By.linkText("My Rewards")).click();
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
    driver.findElement(By.linkText("Wishlist")).click();
    
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
    driver.findElement(By.linkText("Reviews & Ratings")).click();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
    driver.findElement(By.linkText("Email Preferences")).click();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
    driver.findElement(By.linkText("Flipkart First")).click();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
	

}*/

@Then("^user is succesfully navigated to the sell on flipkart page$")
public void user_is_succesfully_navigated_to_the_sell_on_flipkart_page() throws Throwable {
	driver.get(baseUrl + "/");
}
	
	// Product Buy
	
		
		/*WebElement mnuElement=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
											
       Actions builder = new Actions(driver);
												
						//System.out.println("Begin to move element");		
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        builder.moveToElement(mnuElement).click().perform();
        //System.out.println("move Element completed");
			WebElement mnuElement2=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[2]/ul/li[2]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver, 20); 
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[2]/ul/li[2]/a/span")));  // until this submenu is found
			builder.moveToElement(mnuElement2).click().perform();
			//clicking on mobile cases.
  	    driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[2]/ul/li[2]/a/span")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//Clicking on Kapaver Back Cover for Moto E4 Plus
			
			driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[3]/div/a[2]")).click();		 
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//Selecting buy now.
			driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[2]/form/button")).click();
			
			// Clicking on Deliver here button.
			driver.findElement(By.xpath(".//*[@id='ADD14291062081884623']/button")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//Clicking on continue button.
			driver.findElement(By.xpath(".//*[@id='to-payment']/button")).click();

		
	}*/




@When("^I click on Advertise$") 
public void I_click_on_Advertise() throws Throwable {
	//driver.get(baseUrl + "/");
	driver.findElement(By.linkText("Advertise")).click();
  
}

@Then("^Check whether it navigates to ads.flipkart page$") 
public void Check_whether_it_navigates_to_ads_flipkart_page() throws Throwable {
	//driver.get(baseUrl + "/");
    
	driver.findElement(By.linkText("Advertise")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   // driver.findElement(By.cssSelector("img[alt=\"Flipkart\"]")).click();
	
	
	driver.get("http://www.flipkart.com");
}
@Then("^user is succesfully navigated to the advertise page$")
public void user_is_succesfully_navigated_to_the_advertise_page() throws Throwable {
	//driver.get(baseUrl + "/");
	
    
	driver.get("http://www.flipkart.com");

}

@When("^I click on Gift Card$") 
public void I_click_on_Gift_Carde() throws Throwable {
	//driver.get(baseUrl + "/");
	driver.findElement(By.linkText("Gift Card")).click();
    

}

@Then("^Check whether it navigates to Gift Card page$") 
public void Check_whether_it_navigates_to_gift_card_page() throws Throwable {
	//driver.get(baseUrl + "/");
    
	driver.findElement(By.linkText("Gift Card")).click();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://www.flipkart.com");
	
}
@Then("^user is succesfully navigated to the Gift Card page$")
public void user_is_succesfully_navigated_to_the_Gift_Card_page() throws Throwable {
	//driver.get(baseUrl + "/");
	
    
	driver.get("http://www.flipkart.com");

}
	
	
	
	
	
   /* driver.findElement(By.linkText("Download App")).click();
    driver.findElement(By.linkText("24x7 Customer Care")).click();
    driver.findElement(By.linkText("Track Order")).click();
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.linkText("Wallet")).click();
    driver.findElement(By.linkText("My Rewards")).click();
    driver.findElement(By.linkText("Wishlist")).click();
    driver.findElement(By.linkText("Reviews & Ratings")).click();
    driver.findElement(By.linkText("Email Preferences")).click();
    driver.findElement(By.linkText("Flipkart First")).click();
    */

    

}


	
	




