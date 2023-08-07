package page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import helper.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class alertwebpage extends base{
	
public	By alrtbx1 = By.cssSelector("button#alertBox");
public By alrtbx2 = By.cssSelector("button#confirmBox");
public By alrtbx3 = By.cssSelector("button#promptBox");
public By output = By.cssSelector("div#output");

	public void user_click_on_click_me_button() {
		
	
	waitforexpectedelement(alrtbx1).click();
	
	 
	    
	}

	
	public void user_click_on_ok() {
		alertaccepted();
				
	}
	
public void user_click_on_2nd_click_me_button() {
	
	waitforexpectedelement(alrtbx2).click();
		
		
	}
public void user_accept_the_popup() {
	alertaccepted();
	
}

public void user_reject_the_popup() {
	alertdismiss();
	
	
} 

public void user_click_on_3rd_clickme_button() {
	
	waitforexpectedelement(alrtbx3).click();
	
	
}
public void user_click_enter_the_data(String name) {
	 
	 alertsendkey(name);
} 
public void User_click_on_accept() {
	
	
	Assert.assertTrue(driver.findElement(output).isDisplayed());
}

}
