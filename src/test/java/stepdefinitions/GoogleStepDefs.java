package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleStepDefs {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Given("^I am on the google page$")
	public void i_am_on_the_google_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","/Users/nihaltemel/Documents/Libraries/drivers/chromedriver");
	driver.get("https://www.google.com/");
	    	  
	}

	@When("^I enter etsy\\.com in search box$")
	public void i_enter_etsy_com_in_search_box() throws Throwable {
	driver.findElement(By.id("lst-ib")).sendKeys("etsy.com");
	Thread.sleep(5000);
	  
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
	driver.findElement(By.className("lsb")).click();
	 
	}

	@Then("^etsy\\.com should appear on the google page$")
	public void etsy_com_should_appear_on_the_google_page() throws Throwable {
	driver.findElement(By.id("vs0p1c0")).click();
	Assert.assertTrue(driver.findElement(By.id("etsy-logo")).isDisplayed());
	}
	


}
