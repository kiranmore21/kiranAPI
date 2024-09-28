package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginTest {

	
		static WebDriver driver ;
	
@Given("user is on login page")
public void user_is_on_login_page() {
    
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
	
}

@When("user enters valid credintials {string} and {string}")
public void user_enters_valid_credintials_and(String string, String string2) {
    
	driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys(string);
	driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(string2);
	
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
}

@Then("user is on Homepage")
public void user_is_on_homepage() {
  WebElement container =  driver.findElement(By.xpath("//div[contains(@id,'shopping_cart_container')]"));
  container.click();
  
boolean actaul =container.isDisplayed();
Assert.assertTrue(actaul);
  
}

	
}
