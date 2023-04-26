package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCart_SD {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Given("User has already navigated to the product webpage")
	public void product_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://magento.softwaretestingboard.com/cassius-sparring-tank.html");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	}
	
	@Then("user selects size and color")
	public void select_size() throws InterruptedException {
		driver.findElement(By.id("option-label-size-143-item-166")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		Thread.sleep(2000);
	}

	@And("click Add to Cart button")
	public void hits_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.id("product-addtocart-button")).click();;
		Thread.sleep(2000);
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		driver.quit();
	}
	
	@Given("User navigates to the cart page")
	public void navigates_to_the_cart_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/WebDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://magento.softwaretestingboard.com/cassius-sparring-tank.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-166")).click();
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.id("product-addtocart-button")).click();;
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).click();
		Thread.sleep(2000);
	}

	@Then("click on delete button")
	public void click_on_delete_button() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/a[2]")).click();
		Thread.sleep(2000);
	}
	
	@And("close the  browser")
	public void close_the_browser1() {
		driver.close();
	}

}
