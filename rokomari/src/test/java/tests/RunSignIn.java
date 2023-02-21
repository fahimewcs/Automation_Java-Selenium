package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.SignIn;

public class RunSignIn extends BaseDriver {
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test
	public void createAccount() {
		SignIn homePage = new SignIn();
		homePage.clickOnSignIn();
		homePage.sendEmail();
		homePage.sendPassword();
		homePage.clickAccountButton();
		homePage.fahimButton();
		homePage.clickOnSignOut();
	}

}
