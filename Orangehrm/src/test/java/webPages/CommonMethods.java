package webPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivers.PageDriver;

public class CommonMethods {
	
	public void moveElement(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.moveToElement(element).perform();
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


}
