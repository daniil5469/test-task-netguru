package pl.pracuj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NegativeLogInTest {
	
	@Test
	public void  invalidPasswordTest() {

//		Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// 		maximize browser window
		driver.manage().window().maximize();

// 		open page
		String url = "https://login.pracuj.pl";
		driver.get(url);
		System.out.println("The page is open.");
		
//		enter email 
		WebElement email = driver.findElement(By.xpath("//div[@id='app']/div[@class='zFhxl']//form[@class='_9kVzb']//div[@class='_2ZSlh']/input"));
		email.sendKeys("daniil.d.shapovalov@gmail.com");

//		enter password
		WebElement password = driver.findElement(By.xpath("//div[@id='app']/div[@class='zFhxl']//form[@class='_9kVzb']//div[@class='_3KOiA']/input"));
		password.sendKeys("Admin12345");

//		click login button
		WebElement logInButton = driver.findElement(By.cssSelector("._19V_Q"));		
		logInButton.click();
		
//		Catch error message
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//div[@id='app']//div[@class='_1Q0IG']")));
				
//		verifications
		WebElement errorMessage = driver.findElement(By.xpath("/html//div[@id='app']//div[@class='_1Q0IG']"));
		System.out.println("The error popup has been displayed.");

// 		Close browser
		driver.quit();
		
	}

}
