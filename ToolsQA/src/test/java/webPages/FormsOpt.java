package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class FormsOpt extends CommonMethods{
	
	public FormsOpt() {
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")
	WebElement forms1;
	
	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	WebElement practiceForm;
	
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement emailFrm;
	
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement male;
	
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	WebElement female;
	
	@FindBy(xpath = "//label[contains(text(),'Other')]")
	WebElement other;
	
	@FindBy(xpath = "//input[@id='userNumber']")
	WebElement mobile;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
	WebElement subject;
	
	@FindBy(xpath = "//label[contains(text(),'Sports')]")
	WebElement sports;
	
	@FindBy(xpath = "//label[contains(text(),'Sports')]")
	WebElement reading;
	
	@FindBy(xpath = "//label[contains(text(),'Music')]")
	WebElement music;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddress;
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	WebElement chooseFile;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	WebElement dateInput;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
	WebElement doMonth;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
	WebElement doYear;
	
	@FindBy(xpath = "//div[contains(text(),'11')]")
	WebElement dte;
	
	
	public void clickForms() {
		forms1.click();
		timeOut();
		practiceForm.click();
		timeOut();
		
		sendText(firstName, firstNameGenerate());
		sendText(lastName, firstNameGenerate());
		sendText(emailFrm, emailGenerate());
		
		male.click();
		other.click();
		female.click();
		
		sendText(mobile, "1234567890");
		//timeOut();
		
		
		dateInput.click();
		timeOut();
		selectItemByIndex(doMonth, 4);
		selectItemByIndex(doYear, 3);
		timeOut();
		dte.click();
		timeOut();
		
		scrollPageDown();
		timeOut();
		//sendText(subject, "bangla");
		sports.click();
		timeOut();
		reading.click();
		timeOut();
		music.click();
		
		sendText(chooseFile,"C:\\Users\\User\\Pictures\\477-2.png");
		timeOut();
		
		sendText(currentAddress, addressGenerate());
		
		
	}

}
