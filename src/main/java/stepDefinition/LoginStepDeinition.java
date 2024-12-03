package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginStepDeinition {
	
	WebDriver driver;
	
	@Given("^user having valid URL$")
	public void user_having_valid_URL()  {
		
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			  
	}


	@When("^enter valid credentials$")
	public void enter_valid_credentials()  {
	   
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click(); 
	//	driver.findElement(By.id("ClientId")).sendKeys("Silvergregorian");
	//	driver.findElement(By.id("Identifier")).sendKeys("pjagtap");
	//	driver.findElement(By.id("Password")).sendKeys("Guest@123");
		
	}

	@When("^user hit the login button")
	public void user_hit_the_url()  {
	//	driver.findElement(By.xpath("//button[text()='Login']")).click();
	   System.out.println("hit the url successfuly");
	}
	@Then("^user enters into the application$")
	public void user_enters_into_the_application()  {
	   driver.close();
	}

}
