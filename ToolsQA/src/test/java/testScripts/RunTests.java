package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import webPages.ButtonsOpt;
import webPages.ElementsOpt;
import webPages.FormsOpt;
import webPages.HomePage;

public class RunTests extends BaseDriver{
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	//@Test(priority = 1)
	public void mainBody() {
		
		HomePage hPage = new HomePage();
		
		hPage.clickToolsQa();
		hPage.hoverItem();
		hPage.clickOption();
	}
	
	
	//______Elements________
	
	//@Test(priority = 2)
	public void textBoxTest() {
	    ElementsOpt elmnt = new ElementsOpt();
		
		elmnt.clickTextBox();
	}
	
	//@Test(priority = 3)
	public void formsTest() {
	    FormsOpt frm = new FormsOpt();
		
		frm.clickForms();
	}
	
	@Test(priority=4)
	public void buttonsTest() {
		 ButtonsOpt btn = new ButtonsOpt();
		 
		 btn.clickButtons();
	}

}
