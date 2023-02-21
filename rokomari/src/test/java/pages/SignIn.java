package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import drivers.PageDriver;
import utilities.CommonMethods;

public class SignIn extends CommonMethods {
	

	public SignIn() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Sign in')]"),
		@FindBy(xpath = "//a[@class='logged-out-user-menu-btn btn btn-secondary']")
	})
	WebElement signIn;
	
	@FindAll({
		@FindBy(id = "j_username"),
		@FindBy(xpath = "//input[@id='j_username']")
	})
	WebElement emailAddress;
	
	@FindAll({
		@FindBy(id = "j_password"),
		@FindBy(xpath = "//input[@id='j_password']")
	})
	WebElement password;
	
	@FindAll({
		@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	})
	WebElement accountButton;
	
	@FindAll({
		@FindBy(xpath = "//span[contains(text(),'Mohammad Fahim')]")
	})
	WebElement fahim;
	
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	})
	WebElement signOut;
	
	@FindAll({
		@FindBy(xpath = "//body[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
	})
	WebElement Email;
	
	public void findEmail() {
		scrollToElement(Email);
	}
	
	
	public void clickOnSignIn() {
		signIn.click(); 
	}
	
	public void sendEmail() {
		sendText(emailAddress, "01987495540");
	}
	
	public void sendPassword() {
		String pass= "760760760"; 
		sendText(password, pass);
	}
	
	//public void scroll() {
		//scrollPageDown();
	//}
	
	public void clickAccountButton() {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("window.scroll(0,400)");
		timeOut(3000);
		accountButton.click();
		timeOut(5000);
	}
	
	public void fahimButton() {
		fahim.click();
		timeOut(3000);
	}
	
	public void clickOnSignOut() {
		signOut.click();
		timeOut();
	}


}
