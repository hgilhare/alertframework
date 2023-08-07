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
}
