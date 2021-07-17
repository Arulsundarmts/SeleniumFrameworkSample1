//Test Extent Reports

package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExtentReports {

	WebDriver driver = null;

	@BeforeTest
	public void BrowserSetup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 

	}

	@Test(priority = 0)
	public void GoogleSearch() {

		driver.get("http://google.com");
		WebElement SearchText = driver.findElement(By.name("q"));
		SearchText.sendKeys("TestNG");		
	}

	@Test(priority = 1)
	public void GoogleClick() {

		WebElement ClickButton = driver.findElement(By.className("gNO89b"));
		ClickButton.click();
	}

	@AfterTest
	public void BrowserClose() {

		driver.close();
		System.out.println("Test Passed");
	}

}
