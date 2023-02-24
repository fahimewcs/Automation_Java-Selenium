package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import webPages.HomePage;


public class RunHomePage extends BaseDriver{
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseUrl);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority=0)
	public void navigationBar() {
		
		HomePage hPage = new HomePage();
		
		hPage.hoverHeader();
		hPage.hoverBody();
		hPage.clickHeader();
		hPage.clickBody();
		
	}
	
	
	

}

