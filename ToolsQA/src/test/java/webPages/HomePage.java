package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class HomePage extends CommonMethods {
	
	public HomePage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	
	@FindBy(xpath = "//header/a[1]/img[1]")
	WebElement toolsQa;
	
	@FindBy(xpath = "//a[contains(text(),'Main Item 1')]")
	WebElement mainItem1;
	
	@FindBy(xpath = "//a[contains(text(),'Main Item 2')]")
	WebElement mainItem2;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'SUB SUB LIST »')]")
	WebElement subSubList;
	
	@FindBy(xpath = "//a[contains(text(),'Sub Sub Item 1')]")
	WebElement subSubIt1;
	
	@FindBy(xpath = "//a[contains(text(),'Sub Sub Item 2')]")
	WebElement subSubIt2;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Main Item 3')]")
	WebElement mainItem3;
	
	
	
	//----$$_______Options______
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")
	WebElement elements;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]")
	WebElement forms;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")
	WebElement alertFrWin;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")
	WebElement widgets;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]/div[1]")
	WebElement interactions;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/span[1]/div[1]/div[1]")
	WebElement bookStrAppli;
	
	
	
	
	
	//@FindBy(xpath = "")
	//WebElement contactSales;
	
	
	
	
	//---%%------navigation Bar ----%%---
	public void clickToolsQa() {
		toolsQa.click();
		backNavigation();
		timeOut();
	}
	
	public void hoverItem() {
		moveElement(mainItem1);
		timeOut();
		moveElement(mainItem2);
		timeOut();
		moveElement(subSubList);
		timeOut();
		subSubIt2.click();
		timeOut();
		subSubIt1.click();
		timeOut();
		backNavigation();
		moveElement(mainItem3);
		timeOut();
		
	}
	
	public void clickOption() {
		elements.click();
		timeOut();
		elements.click();
		timeOut();
		
		forms.click();
		timeOut();
		forms.click();
		timeOut();
		
		alertFrWin.click();
		timeOut();
		alertFrWin.click();
		timeOut();
		
		
		scrollPageDown();
		timeOut();
		widgets.click();
		timeOut();
		widgets.click();
		timeOut();
		
		interactions.click();
		timeOut();
		interactions.click();
		timeOut();
		
		//bookStrAppli.click();
		//timeOut();
		//bookStrAppli.click();
		//timeOut();
		
	}	
	
		
	
}
