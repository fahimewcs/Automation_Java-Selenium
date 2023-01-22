package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import webPages.HomePage;

public class RunTests extends BaseDriver {
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test
	public void navigationBar() {
		
		HomePage hPage = new HomePage();
		
		hPage.hoverPlatform();
		hPage.hoverWoHrm();
		hPage.hoverResource();
		hPage.hoverCompany();
		hPage.clickBookFreeDemo();
		hPage.clickContactSales();
		
		hPage.clickPplMngLearnMore();
		hPage.clickPplMngLearnIcon();
		hPage.clickHrAdm();
		hPage.clickEmpMngmnt();
		hPage.clickReporting();
		
		hPage.clickCultureLearnMore();
		hPage.clickcultureLearnIcon();
		hPage.clickPerformance();
		hPage.clickCareerDev();
		hPage.clickTraining();
		
		hPage.clickTalentMngLearnMore();
		hPage.clickTalentMngLearnIcon();
		hPage.clickRecruitment();
		hPage.clickOnboarding();
		
		hPage.clickCompstnLearnMore();
		hPage.clickCompstnLearnIcon();
		hPage.clickPayroll();
		hPage.clickPTO();
		hPage.clickTimeTrac();
		
		hPage.clickTryItrFree();
		
	}
	
	
	

}
