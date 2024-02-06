package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

	ChromeDriver driver;

	@BeforeMethod
	public void start(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hambardzumyan.levon\\Desktop\\LearningSelenium-master\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	public void loginWithValidUserNameAndValidPassowrd() {


		// Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle()+"-=--------------------------------");

	}

	@Test
	public void loginWithValidUserNameAndInValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("testPassword");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle()+"-=--------------------------------");

	}

	@Test
	public void loginWithInValidUserNameAndValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("testUser");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle()+"-=--------------------------------");

	}

	@Test
	public void loginWithInValidUserNameAndInValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("testUser");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("testPassword");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle()+"-=--------------------------------");

	}
	@AfterMethod
	public void tearDown() {
		// Close the WebDriver instance
		if (driver != null) {
			driver.quit();
		}
	}

}
