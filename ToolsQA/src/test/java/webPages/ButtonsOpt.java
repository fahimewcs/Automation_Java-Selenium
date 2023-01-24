package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class ButtonsOpt extends CommonMethods{
	
	public ButtonsOpt() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")
	WebElement elements;
	
	@FindBy(xpath = "//span[contains(text(),'Buttons')]")
	WebElement buttons;
	
	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	WebElement dblClick;
	
	@FindBy(xpath = "//button[@id='rightClickBtn']")
	WebElement rgtClick;
	
	@FindBy(id= "t0JbH")
	WebElement clickMe;
	
	public void clickButtons() {
		elements.click();
		timeOut();
		scrollWindow("window.scroll(0,300)");
		buttons.click();
		timeOut();
		dubleClick(dblClick);
		timeOut();
		rightClick(rgtClick);
		timeOut();
		//clickMe.click();
		timeOut();
	}

}
