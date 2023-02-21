package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utilities.CommonMethods;

public class HomePage extends CommonMethods{
	
	public HomePage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'ইলেক্ট্রনিক্স')]")
	WebElement electronics;
	
	@FindBy(xpath = "//a[contains(text(),'মনিহারি পণ্য')]")
	WebElement monihari;
	
	@FindBy(xpath = "//a[contains(text(),'কিডস জোন')]")
	WebElement kidsJone;
	
	@FindBy(xpath = "//a[contains(text(),'গিফট ফাইন্ডার')]")
	WebElement giftFinder;
	
	@FindBy(xpath = "//a[contains(text(),'প্রাতিষ্ঠানিক অর্ডার')]")
	WebElement prathisthanikOrder;
	
	@FindBy(xpath = "//a[contains(text(),'অফার সমূহ')]")
	WebElement offerSomuho;
	
	@FindBy(xpath = "//a[contains(text(),'ব্লগ')]")
	WebElement blog;
	
	@FindBy(xpath = "//a[@id='js--authors']")
	WebElement lekhok;
	
	@FindBy(xpath = "//a[@id='js--categories']")
	WebElement bishoy;
	
	@FindBy(xpath = "//a[@id='js--publishers']")
	WebElement prokashoni;
	
	@FindBy(xpath = "//a[contains(text(),'স্টকের প্রোডাক্ট সমূহ')]")
	WebElement stockProduct;
	
	@FindBy(xpath = "//a[contains(text(),'অর্গানিক ফুড')]")
	WebElement organicFood;
	
	@FindBy(xpath = "//a[contains(text(),'প্রি-অর্ডার')]")
	WebElement preOrder;
	
	@FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement islamicBook;
	
	@FindBy(xpath = "//a[contains(text(),'ই-বুক')]")
	WebElement eBook;
	
	@FindBy(xpath = "//a[contains(text(),'এডমিশন কার্নিভাল ২০২৩')]")
	WebElement admissionCarnival;
	
	@FindBy(xpath = "//a[contains(text(),'ডাউনলোড করুন রকমারি ইবুক')]")
	WebElement downloadEbook;
	
	
	//___________
	
	/*
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "//a[contains(text(),'ডাউনলোড করুন রকমারি ইবুক')]")
	WebElement downloadEbook;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	*/
	
	
	public void clickAll() {
		
		electronics.click();
		backNavigation(electronics);
		
		monihari.click();
		backNavigation(monihari);
		
		kidsJone.click();
		backNavigation(kidsJone);
		
		giftFinder.click();
		backNavigation(giftFinder);
		
		prathisthanikOrder.click();
		backNavigation(prathisthanikOrder);
		
		offerSomuho.click();
		backNavigation(offerSomuho);
		
		blog.click();
		backNavigation(blog);
		
		stockProduct.click();
		backNavigation(stockProduct);
		
		organicFood.click();
		backNavigation(organicFood);
		
		preOrder.click();
		backNavigation(preOrder);
		
		islamicBook.click();
		backNavigation(islamicBook);
		
		eBook.click();
		backNavigation(eBook);
		
		admissionCarnival.click();
		backNavigation(electronics);
		
		downloadEbook.click();
		backNavigation(admissionCarnival);
		
	}
	
	public void hoverAll() {
		moveElement(lekhok);
		timeOut();
		
		moveElement(bishoy);
		timeOut();
		
		moveElement(prokashoni);
		timeOut();
		
		scrollWindow("winedow.scroll(0,650)");
		
	}

}
