package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import webPages.HomePage;

public class RunTests extends BaseDriver{
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test
	public void mainBody() {
		
		HomePage hPage = new HomePage();
		
		hPage.clickToolsQa();
		hPage.hoverItem();
		hPage.clickOption();
	}

}
