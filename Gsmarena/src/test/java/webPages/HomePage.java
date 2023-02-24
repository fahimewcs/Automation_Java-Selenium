package webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class HomePage extends CommonMethods{
	public HomePage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	//___________Header____________
	@FindBy(xpath = "//header/div[1]/div[1]/button[1]")
	WebElement toggleNav;
	
	@FindBy(xpath = "//img[@alt = 'GSMArena.com']")
	WebElement gSmArena;
	
	@FindBy(xpath = "//input[@id='topsearch-text']")
	WebElement searchBar;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[1]/i[1]")
	WebElement tips;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[2]/i[1]")
	WebElement youTube;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[3]/i[1]")
	WebElement insTagram;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[4]/i[1]")
	WebElement rSS;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[5]/i[1]")
	WebElement eV;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[6]/i[1]")
	WebElement merch;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[7]/i[1]")
	WebElement logIn;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/a[8]/i[1]")
	WebElement signUp;
	

	//________Body__________
	@FindBy(xpath = "//span[contains(text(),'Phone finder')]")
	WebElement phoneFinder;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement samsung;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement apple;
	
	@FindBy(xpath = "//a[contains(text(),'Huawei')]")
	WebElement huawei;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement nokia;
	
	@FindBy(xpath = "//a[contains(text(),'Sony')]")
	WebElement sony;
	
	@FindBy(xpath = "//a[contains(text(),'LG')]")
	WebElement lg;
	
	@FindBy(xpath = "//a[contains(text(),'HTC')]")
	WebElement htc;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[8]/a[1]")
	WebElement motorla;
	
	@FindBy(xpath = "//a[contains(text(),'Lenovo')]")
	WebElement lenovo;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[10]/a[1]")
	WebElement xiaomi;
	
	@FindBy(xpath = "//a[contains(text(),'Google')]")
	WebElement google;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[12]/a[1]")
	WebElement honor;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[13]/a[1]")
	WebElement oppo;
	
	@FindBy(xpath = "//a[contains(text(),'Realme')]")
	WebElement realme;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[15]/a[1]")
	WebElement onePlus;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[16]/a[1]")
	WebElement vivo;
	
	@FindBy(xpath = "//a[contains(text(),'Meizu')]")
	WebElement meizu;
	
	@FindBy(xpath = "//a[contains(text(),'BlackBerry')]")
	WebElement blackberry;
	
	@FindBy(xpath = "//a[contains(text(),'Asus')]")
	WebElement asus;
	
	@FindBy(xpath = "//a[contains(text(),'Alcatel')]")
	WebElement alactel;
	
	@FindBy(xpath = "//a[contains(text(),'ZTE')]")
	WebElement zte;
	
	@FindBy(xpath = "//a[contains(text(),'Microsoft')]")
	WebElement microsoft;
	
	@FindBy(xpath = "//a[contains(text(),'Vodafone')]")
	WebElement vodafone;
	
	@FindBy(xpath = "//a[contains(text(),'Energizer')]")
	WebElement energizer;
	
	@FindBy(xpath = "//a[contains(text(),'Energizer')]")
	WebElement cat;
	
	@FindBy(xpath = "//a[contains(text(),'Sharp')]")
	WebElement sharp;
	
	@FindBy(xpath = "//a[contains(text(),'Micromax')]")
	WebElement micromax;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[28]/a[1]")
	WebElement infinix;
	
	@FindBy(xpath = "//a[contains(text(),'TCL')]")
	WebElement tcl;
	
	@FindBy(xpath = "//a[contains(text(),'Ulefone')]")
	WebElement ulefone;
	
	@FindBy(xpath = "//a[contains(text(),'Tecno')]")
	WebElement tecno;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='outer']/div[@id='body']/aside[1]/div[1]/ul[1]/li[32]/a[1]")
	WebElement doogle;
	
	@FindBy(xpath = "//a[contains(text(),'Blackview')]")
	WebElement blackview;
	
	@FindBy(xpath = "//a[contains(text(),'BLU')]")
	WebElement blu;
	
	@FindBy(xpath = "//a[contains(text(),'Panasonic')]")
	WebElement panasonic;
	
	@FindBy(xpath = "//a[contains(text(),'Plum')]")
	WebElement plum;
	
	@FindBy(xpath = "//span[contains(text(),'All brands')]")
	WebElement allBrands;
	
	@FindBy(xpath = "//span[contains(text(),'Rumor mill')]")
	WebElement rumorMill;
	

	
	//_____________Footer_____________
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[1]")
	WebElement home;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[2]")
	WebElement news;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[3]")
	WebElement reviews;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[4]")
	WebElement compare;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[5]")
	WebElement coverage;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[1]/a[6]")
	WebElement glossary;
	
	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement FAQ;
	
	@FindBy(xpath = "//a[contains(text(),'RSS feed')]")
	WebElement rssFeed;
	
	@FindBy(xpath = "//a[contains(text(),'Youtube')]")
	WebElement youtube;
	
	@FindBy(xpath = "//a[contains(text(),'Facebook')]")
	WebElement facebook;
	
	@FindBy(xpath = "//a[contains(text(),'Twitter')]")
	WebElement twitter;
	
	@FindBy(xpath = "//a[contains(text(),'Instagram')]")
	WebElement instagram;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[2]/a[1]")
	WebElement gsmArena;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[2]/a[2]")
	WebElement mobileVersion;
	
	@FindBy(xpath = "//a[contains(text(),'Android app')]")
	WebElement android;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[2]/a[4]")
	WebElement tools;
	
	@FindBy(xpath = "//body/div[@id='wrapper']/div[@id='footer']/div[@id='footmenu']/p[2]/a[5]")
	WebElement contact;
	
	@FindBy(xpath = "//a[contains(text(),'Merch store')]")
	WebElement merchStore;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	WebElement privacy;
	
	@FindBy(xpath = "//a[contains(text(),'Terms of use')]")
	WebElement termsOfUse;
	
	
	
	public void hoverHeader() {
		moveElement(toggleNav);
		timeOut();
		
		//moveElement(gSmArena);
		//timeOut();
		
		moveElement(searchBar);
		timeOut();
		
		moveElement(tips);
		timeOut();
		
		moveElement(youTube);
		timeOut();
		
		moveElement(insTagram);
		timeOut();
		
		moveElement(rSS);
		timeOut();
		
		moveElement(eV);
		timeOut();
		
		moveElement(merch);
		timeOut();
		
		moveElement(logIn);
		timeOut();
		
		moveElement(signUp);
		timeOut();

		
	}
	
	
	public void hoverBody() {
		moveElement(phoneFinder);
		timeOut();
		
		moveElement(samsung);
		timeOut();
		
		moveElement(apple);
		timeOut();
		
		moveElement(huawei);
		timeOut();
		
		moveElement(nokia);
		timeOut();
		
		moveElement(sony);
		timeOut();
		
		moveElement(lg);
		timeOut();
		
		moveElement(htc);
		timeOut();
		
		moveElement(motorla);
		timeOut();
		
		moveElement(lenovo);
		timeOut();
		
		moveElement(xiaomi);
		timeOut();
		
		moveElement(google);
		timeOut();
		
		moveElement(honor);
		timeOut();
		
		moveElement(oppo);
		timeOut();
		
		moveElement(realme);
		timeOut();
		
		moveElement(onePlus);
		timeOut();
		
		moveElement(vivo);
		timeOut();
		
		moveElement(meizu);
		timeOut();
		
		moveElement(blackberry);
		timeOut();
		
		moveElement(asus);
		timeOut();
		
		moveElement(alactel);
		timeOut();
		
		moveElement(zte);
		timeOut();
		
		moveElement(microsoft);
		timeOut();
		
		moveElement(vodafone);
		timeOut();
		
		moveElement(energizer);
		timeOut();
		
		moveElement(cat);
		timeOut();
		
		moveElement(sharp);
		timeOut();
		
		moveElement(micromax);
		timeOut();
		
		moveElement(infinix);
		timeOut();
		
		moveElement(tcl);
		timeOut();
		
		moveElement(ulefone);
		timeOut();
		
		moveElement(tecno);
		timeOut();
		
		moveElement(doogle);
		timeOut();
		
		moveElement(blackview);
		timeOut();
		
		moveElement(blu);
		timeOut();
		
		moveElement(panasonic);
		timeOut();
		
		moveElement(plum);
		timeOut();
		
		moveElement(allBrands);
		timeOut();
		
		moveElement(rumorMill);
		timeOut();
		
		
	}
	
	
	public void clickHeader() {
		toggleNav.click();
		backNavigation();
		timeOut();
		
		gSmArena.click();
		backNavigation();
		timeOut();
		
		searchBar.click();
		backNavigation();
		timeOut();
		
		tips.click();
		backNavigation();
		timeOut();
		
		youTube.click();
		backNavigation();
		timeOut();
		
		insTagram.click();
		backNavigation();
		timeOut();
		
		rSS.click();
		backNavigation();
		timeOut();
		
		eV.click();
		backNavigation();
		timeOut();
		
		merch.click();
		backNavigation();
		timeOut();
		
		logIn.click();
		backNavigation();
		timeOut();
		
		signUp.click();
		backNavigation();
		timeOut();

		
	}
	
	
	public void clickBody() {
		phoneFinder.click();
		backNavigation();
		timeOut();
		
		samsung.click();
		backNavigation();
		timeOut();
		
		apple.click();
		backNavigation();
		timeOut();
		
		huawei.click();
		backNavigation();
		timeOut();
		
		nokia.click();
		backNavigation();
		timeOut();
		
		sony.click();
		backNavigation();
		timeOut();
		
		lg.click();
		backNavigation();
		timeOut();
		
	    htc.click();
		backNavigation();
		timeOut();
		
		motorla.click();
		backNavigation();
		timeOut();
		
		lenovo.click();
		backNavigation();
		timeOut();
		
		xiaomi.click();
		backNavigation();
		timeOut();
		
		google.click();
		backNavigation();
		timeOut();
		
		honor.click();
		backNavigation();
		timeOut();
		
		oppo.click();
		backNavigation();
		timeOut();
		
		realme.click();
		backNavigation();
		timeOut();
		
		onePlus.click();
		backNavigation();
		timeOut();
		
		vivo.click();
		backNavigation();
		timeOut();
		
		meizu.click();
		backNavigation();
		timeOut();
		
		blackberry.click();
		backNavigation();
		timeOut();
		
		asus.click();
		backNavigation();
		timeOut();
		
		alactel.click();
		backNavigation();
		timeOut();
		
		zte.click();
		backNavigation();
		timeOut();
		
		microsoft.click();
		backNavigation();
		timeOut();
		
		vodafone.click();
		backNavigation();
		timeOut();
		
		energizer.click();
		backNavigation();
		timeOut();
		
		cat.click();
		backNavigation();
		timeOut();
		
		sharp.click();
		backNavigation();
		timeOut();
		
		micromax.click();
		backNavigation();
		timeOut();
		
		infinix.click();
		backNavigation();
		timeOut();
		
		tcl.click();
		backNavigation();
		timeOut();
		
		ulefone.click();
		backNavigation();
		timeOut();
		
		tecno.click();
		backNavigation();
		timeOut();
		
		doogle.click();
		backNavigation();
		timeOut();
		
		blackview.click();
		backNavigation();
		timeOut();
		
		blu.click();
		backNavigation();
		timeOut();
		
		panasonic.click();
		backNavigation();
		timeOut();
		
		plum.click();
		backNavigation();
		timeOut();
		
		allBrands.click();
		backNavigation();
		timeOut();
		
		rumorMill.click();
		backNavigation();
		timeOut();

		
	}
	
	

}
