package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JustEatStepDefiniion {

	WebDriver driver;

	@Given("^I want food in \"AR51 1AA\"$") 
	public void I_want_food_in_location(){
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.just-eat.co.uk/"); 
		driver.manage().window().maximize();
	}

	@When("^I search for restaurants$") 
	public void I_search_for_restaurants(){ 
		driver.findElement(By.name("postcode")).sendKeys("AR51 1AA");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in_given_location(String postalCode) {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Restaurants and takeaways in Area51, AR51 | Just Eat";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.findElement(By.id("dish-search")).sendKeys(postalCode);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@data-search-count='openrestaurants']"));
		driver.quit();
	}

	@Given("^I want food at \"([^\"]*)\"$")
	public void i_want_food_at_location(String PostCode) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.just-eat.co.uk/"); 
		driver.manage().window().maximize();
		driver.findElement(By.name("postcode")).sendKeys(PostCode);

	}

	@When("^I click on send button$")
	public void i_click_on_send_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^it gives an error message$")
	public void it_gives_an_error_message() {
		String Actual_ErrorMsg = driver.findElement(By.id("errorMessage")).getText();
		System.out.println(Actual_ErrorMsg);
		String Expecter_ErrorMsg = "Please enter a full, valid postcode";
		Assert.assertEquals(Expecter_ErrorMsg, Actual_ErrorMsg);
		driver.quit();
	}

	@Given("^I am on Just-Eat website$")
	public void i_am_on_Just_Eat_website(){
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.just-eat.co.uk/"); 
		driver.manage().window().maximize();
	}

	@When("^I click on Help button$")
	public void i_click_on_Help_button(){
		driver.findElement(By.linkText("Help")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@Then("^I lend on Help page$")
	public void i_lend_on_Help_page(){
		String Actual_title =driver.getTitle();
		String Expected_title = "Help - JUST EAT";
		Assert.assertEquals(Expected_title, Actual_title);
		driver.quit();
	}

}

