package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {

	// username
	@FindBy(name = "username")
	WebElement userNameTextBox;

	// password
	@FindBy(name = "password")
	WebElement passwordTextBox;

	// login button
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBTn;

	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	Logger log = LogManager.getLogger(LoginPage.class);

	public void loginToApplication(String userName, String password) {
		userNameTextBox.sendKeys(userName);
		log.info("Username is entered in username text box");
		ExtentReportUtils.addStep("Username is entered");

		passwordTextBox.sendKeys(password);
		log.info("Pssword is entered in Password text box");
		ExtentReportUtils.addStep("Password value is entered in Password text box.");

		loginBTn.click();
		log.info("Login button is clicked.");
		ExtentReportUtils.addStep("Login button is clicked.");

	}

}
