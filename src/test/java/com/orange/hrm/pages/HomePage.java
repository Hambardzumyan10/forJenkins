package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage {

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminlink;

	@FindBy(xpath = "//img[@alt=\"profile picture\"]")
	WebElement profilePicture;

	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	Logger log = LogManager.getLogger(HomePage.class);

	public void clickOnAdminLInk() {
		adminlink.click();
		log.info("Admin link is clicked.");

	}

	public void logoutFromApplication() {
		profilePicture.click();
		log.info("profile Picture button is clicked.");
		ExtentReportUtils.addStep("Profile Picture image is cllicked.");

		logoutLink.click();
		log.info("Logout link is cliked.");
		ExtentReportUtils.addStep("Logout link is clicked.");

	}

}
