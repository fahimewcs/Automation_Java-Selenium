package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class ElementsOpt extends CommonMethods{
	
	public ElementsOpt() {
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
	}
	
	//_______0000____Text Box_______0000____
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")
	WebElement element1;
	
	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	WebElement textBox;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement fullName;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddress;
	
	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement permarentAddress;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;
	
	public void clickTextBox() {
		element1.click();
		timeOut();
		textBox.click();
		timeOut();
		sendText(fullName, firstNameGenerate());
		sendText(email, emailGenerate());
		sendText(currentAddress, addressGenerate());
		sendText(permarentAddress, addressGenerate());
		timeOut();
		
		scrollPageDown();
		timeOut();
		//submit.click();
		//timeOut();
	}

}
