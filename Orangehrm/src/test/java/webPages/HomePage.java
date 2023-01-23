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
	
	//----$$---navigation Bar-----
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement platform;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement wOHrm;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement resource;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement company;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/button[1]")
	WebElement bookFreeDemo;
	
	@FindBy(xpath = "//body/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/button[1]")
	WebElement contactSales;
	
	
	
	
	//----$$---Email---Try it for free----$$----
	@FindBy(xpath = "//input[@id='Form_getForm_Email']")
	WebElement mainPgEmail;
	
	@FindBy(xpath = "//input[@id='Form_getForm_action_submitForm']")
	WebElement firstTryFree;
	
	
	
	
	//-----$$--People Management-----
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h6[1]")
	WebElement pplMngmntLearnMore;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[2]/img[1]")
	WebElement pplMngmntLearnMIcon;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement hrAdministration;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]/img[1]")
	WebElement employeeManagement;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")
	WebElement reporting;
	
	
	
	//----&&---Culture------
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/section[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h6[1]")
	WebElement cultureLearnMore;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[2]/img[1]")
	WebElement cultureLearnIcon;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[2]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement performance;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[2]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]/img[1]")
	WebElement careerDev;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[2]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")
	WebElement training;
	
	
	//----&&---Talent Management------
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/section[3]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h6[1]")
	WebElement talentMngLearnMore;
		
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[3]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[2]")
	WebElement talentMngLearnIcon;
		
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[3]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement recruitment;
		
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[3]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]/img[1]")
	WebElement onboarding;
	
	
	//-----$$$------Compensation-----$$----
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/section[4]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h6[1]")
	WebElement compensationLearnMore;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[4]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[2]/img[1]")
	WebElement compensationLearnIcon;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[4]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement payroll;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[4]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]/img[1]")
	WebElement pto;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/section[4]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]")
	WebElement timeTrac;
	
	//-----$$$----Try it for Free----$$$--------
	@FindBy(xpath = "//button[contains(text(),'Try it for Free')]")
	WebElement tryItFree;
	
	
	//@FindBy(xpath = "")
	//WebElement contactSales;
	
	
	
	
	//---%%------navigation Bar ----%%---
	public void hoverPlatform() {
		/*Actions actions = new Actions(PageDriver.getCurrentDriver());
		WebElement platform = PageDriver.getCurrentDriver().findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		actions.moveToElement(platform).perform();
		Thread.sleep(2000); */
		moveElement(platform);
		timeOut();
	}
	
	public void hoverWoHrm() {
		moveElement(wOHrm);
		timeOut();
	}
	
	public void hoverResource() {
		moveElement(resource);
		timeOut();
	}
	
	public void hoverCompany() {
		moveElement(company);
		timeOut();
	}
	
	public void clickBookFreeDemo() {
		bookFreeDemo.click();
		backNavigation();
		timeOut();
	}
	
	public void clickContactSales() {
		contactSales.click();
		backNavigation();
		timeOut();
	}
	
	
	//-----$$$-- Enter Email ---- Try for Free-----
	
	public void clickWithoutEmailTryFree() {
		firstTryFree.click();
		backNavigation();
		timeOut();
	}
	
	public void sendEmail() {
		sendText(mainPgEmail, emailGenerate());
		firstTryFree.click();
		timeOut();
	}
	
	
	
	
	
	//----%%%----People Management-----%%%%-----
	public void clickPplMngLearnMore() {
		//JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		//js.executeScript("window.scroll(0,2200)");
		scrollWindow("window.scroll(0,2200)");
		timeOut();
		pplMngmntLearnMore.click();
		backNavigation();
		timeOut();
	}
	
	public void clickPplMngLearnIcon() {
		timeOut();
		pplMngmntLearnMIcon.click();
		backNavigation();
		timeOut();
	}
	
	public void clickHrAdm() {
		timeOut();
		hrAdministration.click();
		backNavigation();
		timeOut();
	}
	
	public void clickEmpMngmnt() {
		timeOut();
		employeeManagement.click();
		backNavigation();
		timeOut();
	}
	
	public void clickReporting() {
		timeOut();
		reporting.click();
		backNavigation();
		timeOut();
	}
	
	
	
	
	
	//----%%%-----Culture-----%%%---
	public void clickCultureLearnMore() {
		//JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		//js.executeScript("window.scroll(0,2200)");
		scrollWindow("window.scroll(0,3000)");
		timeOut();
		cultureLearnMore.click();
		backNavigation();
		timeOut();
	}
	
	public void clickcultureLearnIcon() {
		timeOut();
		cultureLearnIcon.click();
		backNavigation();
		timeOut();
	}
	
	public void clickPerformance() {
		timeOut();
		performance.click();
		backNavigation();
		timeOut();
	}
	
	public void clickCareerDev() {
		timeOut();
		careerDev.click();
		backNavigation();
		timeOut();
	}
	
	public void clickTraining() {
		timeOut();
		training.click();
		backNavigation();
		timeOut();
	}
	
	
	
	
	//----%%%-----Talent Management-----%%%---
		public void clickTalentMngLearnMore() {
			//JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
			//js.executeScript("window.scroll(0,2200)");
			scrollWindow("window.scroll(0,3850)");
			timeOut();
			talentMngLearnMore.click();
			backNavigation();
			timeOut();
		}
		
		public void clickTalentMngLearnIcon() {
			timeOut();
			talentMngLearnIcon.click();
			backNavigation();
			timeOut();
		}
		
		public void clickRecruitment() {
			timeOut();
			recruitment.click();
			backNavigation();
			timeOut();
		}
		
		public void clickOnboarding() {
			timeOut();
			onboarding.click();
			backNavigation();
			timeOut();
		}
		
		
		
		//----%%%-----Compensation-----%%%---
		public void clickCompstnLearnMore() {
			//JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
			//js.executeScript("window.scroll(0,2200)");
			scrollWindow("window.scroll(0,4500)");
			timeOut();
			compensationLearnMore.click();
			backNavigation();
			timeOut();
		}
		
		public void clickCompstnLearnIcon() {
			timeOut();
			compensationLearnIcon.click();
			backNavigation();
			timeOut();
		}
		
		public void clickPayroll() {
			timeOut();
			payroll.click();
			backNavigation();
			timeOut();
		}
		
		public void clickPTO() {
			timeOut();
			pto.click();
			backNavigation();
			timeOut();
		}
		
		public void clickTimeTrac() {
			timeOut();
			timeTrac.click();
			backNavigation();
			timeOut();
		}
		
		
		//-----%%%---Try it for free--%%%%%---
		public void clickTryItrFree() {
			scrollWindow("window.scroll(0,5000)");
			timeOut();
			tryItFree.click();
			backNavigation();
			timeOut();
		}
		
	

}
