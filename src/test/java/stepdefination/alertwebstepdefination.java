package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.alertwebpage;

public class alertwebstepdefination {
	
	alertwebpage m = new alertwebpage();
	@Given("user click on click me button")
	public void user_click_on_click_me_button() {
		m.user_click_on_click_me_button();
	    
	}

	@Then("user click on OK")
	public void user_click_on_ok() {
		m.user_click_on_ok();

	}

}
