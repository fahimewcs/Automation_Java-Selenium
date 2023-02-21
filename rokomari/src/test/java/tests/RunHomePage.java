package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;

public class RunHomePage extends BaseDriver{
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	//@Test
	public void testElementClick() {
		HomePage hPage = new HomePage();
		
		hPage.clickAll();
	}
	
	@Test
	public void testHoverElement() {
		HomePage hPage = new HomePage();
		
		hPage.hoverAll();
	}

}
