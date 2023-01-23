package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class Platform extends CommonMethods{
	
	public Platform() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement platform1;
	
	//@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	//WebElement platform2;
	
	//-----$$$---people Management---------$$----
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
	WebElement peopleMngmnt;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/h6[1]/a[1]")
	WebElement hrAdministration;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/h6[2]/a[1]")
	WebElement employeeMngmnt;

	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/h6[3]/a[1]")
	WebElement reportingAnls;
	
	
	//---$$$$---TALENT Management----$$-----
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement talentMngmnt1;

	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/h6[1]/a[1]")
	WebElement recruitment1;

	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/h6[2]/a[1]")
	WebElement onboarding1;
	
	
	//----&&----Compensation---$$----
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
	WebElement compensation1;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/h6[1]/a[1]")
	WebElement payroll1;

	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/h6[2]/a[1]")
	WebElement pto1;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/h6[3]/a[1]")
	WebElement timeTrac1;
	
	
	//-----&&----Culture----&&-----
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")
	WebElement culture1;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/h6[1]/a[1]")
	WebElement performMngmnt1;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/h6[2]/a[1]")
	WebElement careerDev1;
	
	@FindBy(xpath = "//a[contains(text(),'Training (LMS)')]")
	WebElement training1;
	
	
	
	//-----%%%%---people Management---------%%%----
	public void hoverPeopleManagement() {
		moveElement(platform1);
		moveElement(peopleMngmnt);
		hrAdministration.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(peopleMngmnt);
		employeeMngmnt.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(peopleMngmnt);
		reportingAnls.click();
		backNavigation();
		timeOut();
	}
	
	//---%%%---TALENT Management----%%%-----
	public void hoverTalentManagement() {
		moveElement(platform1);
		moveElement(talentMngmnt1);
		recruitment1.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(peopleMngmnt);
		moveElement(talentMngmnt1);
		onboarding1.click();
		backNavigation();
		timeOut();
		
	}
	//----%%%%----Compensation---%%%----
	public void hoverCompensation() {
		moveElement(platform1);
		moveElement(compensation1);
		payroll1.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(compensation1);
		pto1.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(compensation1);
		timeTrac1.click();
		backNavigation();
		timeOut();
	}
	
	
	//-----%%%________Culture________%%%%_______
	public void hoverCulture() {
		moveElement(platform1);
		moveElement(culture1);
		performMngmnt1.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(culture1);
		careerDev1.click();
		backNavigation();
		timeOut();
		
		moveElement(platform1);
		moveElement(culture1);
		training1.click();
		backNavigation();
		timeOut();
	}



}
