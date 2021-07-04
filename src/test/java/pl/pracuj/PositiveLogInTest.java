package pl.pracuj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogInTest {

	@Test
	public void loginTest() {
		System.out.println("Starting loginTest");
		
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
		password.sendKeys("Test_netguru07-04-2021");

//		click login button
		WebElement logInButton = driver.findElement(By.cssSelector("._19V_Q"));		
		logInButton.click();
		
//		accept an agreement
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pracuj-cookie-agreements']//div[@class='c24ljaa']/div[@class='g1kqzctt']//button[@title='Akceptuj wszystkie']")));
		
//		verifications:
		
//		new url	
		String expectedUrl = "https://www.pracuj.pl/apps/konto/rekomendowane-oferty";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");
		
//		dashboard message
		
		WebElement dashboardMessage = driver.findElement(By.xpath("//div[@id='offers']/gpnm-recommendations[@class='list-container']//span[.='Rekomendowane oferty']"));
		System.out.println("The authorization successful.");
		
		// Close browser
		driver.quit();
	}

}
