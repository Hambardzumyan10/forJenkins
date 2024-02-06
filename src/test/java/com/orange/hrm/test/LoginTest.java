//package com.orange.hrm.test;
//
//import java.io.IOException;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.testng.annotations.Test;
//
//import com.orange.hrm.pages.LoginPage;
//import com.utility.ExcelUtiity;
//import com.utility.PropertiesUtility;
//
//public class LoginTest extends BaseTest {
//
//	@Test
//	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
//
//		LoginPage loginPage = new LoginPage();
//
//		// loginPage.loginToApplication(ExcelUtiity.getTestData(1, 0),
//		// ExcelUtiity.getTestData(1, 1));
//
//		loginPage.loginToApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"));
//
//	}
//
//}
