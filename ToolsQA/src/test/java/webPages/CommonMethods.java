package webPages;

import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import drivers.PageDriver;

public class CommonMethods {
	
	public void moveElement(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.moveToElement(element).perform();
	}
	
	//right click___________
	public void rightClick(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.contextClick(element).perform();
	}
	
	public void dubleClick(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.doubleClick(element).perform();
	}
	
	//navigation back
	public void backNavigation() {
		PageDriver.getCurrentDriver().navigate().back();
	}
	
	//navigation back
	public void forwardNavigation() {
		PageDriver.getCurrentDriver().navigate().forward();
	}
	
	// wait for default set seconds
		public void timeOut() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// wait for customize given seconds
		public void timeOut(int durationMS) {
			try {
				Thread.sleep(durationMS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/************************************************
		 * Scroll to an element *
		 * 
		 * @param element This is the target element *
		 ************************************************
		 */

		public void scrollToElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		
		public void scrollWindow(String element) {
			JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
			js.executeScript(element);
		}
		
		public void scrollPageDown() {
			Actions action = new Actions(PageDriver.getCurrentDriver());
			action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			// action.sendKeys(Keys.PAGE_DOWN).build().perform();
			//timeOut();
		}
		
		
		////----Writing text in a input field
		public void sendText(WebElement element, String value) {
			element.clear();
			element.sendKeys(value);
		}
		
		
		////generating fake value
		public static Faker faker = new Faker(new Locale("en-US"));
		
		public static String email;

		public static String emailGenerate() {
			email = faker.bothify("????##@example.com");
			return email;
		}
		
		public static String firstName;

		public static String firstNameGenerate() {
			firstName = faker.name().firstName();
			return firstName;
		}
		
		public static String address;

		public static String addressGenerate() {
			address = faker.address().fullAddress();
			return address;
		}
		
		
		
		//--------select-----------
		public void selectItemByIndex(WebElement element, int index) {
			Select selectItems = new Select(element);
			selectItems.selectByIndex(index);
		}
		


}
