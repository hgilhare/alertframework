package stepdefination;

import io.cucumber.java.en.And;
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

	@And("user click on 2nd click me button")
	public void user_click_on_2nd_click_me_button() {

		m.user_click_on_2nd_click_me_button();
	}

	@And("user accept the popup")
	public void user_accept_the_popup() {
		m.user_accept_the_popup();
	}

	@And("user reject the popup")
	public void user_reject_the_popup() {

		m.user_reject_the_popup();
	}

	@And("user click on 3rd clickme button")
	public void user_click_on_3rd_clickme_button() {
		m.user_click_on_3rd_clickme_button();
	}

	@And("user click enter the data {string}")
	public void user_click_enter_the_data(String name) {
		m.user_click_enter_the_data(name);

	}

	
@And("User click on accept")
public void User_click_on_accept() {
 m.User_click_on_accept();
	
}
}
