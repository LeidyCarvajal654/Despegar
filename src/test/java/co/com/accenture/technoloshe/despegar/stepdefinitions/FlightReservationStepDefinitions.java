package co.com.accenture.technoloshe.despegar.stepdefinitions;



import org.openqa.selenium.WebDriver;

import co.com.accenture.technoloshe.despegar.questions.MistakeData;
import co.com.accenture.technoloshe.despegar.tasks.OpenTheBrowser;
import co.com.accenture.technoloshe.despegar.tasks.SearchFlight;
import co.com.accenture.technoloshe.despegar.userinterfaces.DespegarHome;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class FlightReservationStepDefinitions {

	private DespegarHome pagina;
	private Actor actor = Actor.named("Leidy");
	
	@Managed (driver = "chrome")
	public WebDriver driver;
	
	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(driver));
	}


	@Given("^that Leidy wants book a trip$")
	public void thatLeidyWantsBookATrip() throws Exception {
		actor.wasAbleTo(OpenTheBrowser.on(pagina));
	    
	}

	@When("^she reserves the flight from \"([^\"]*)\" to \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
	public void sheReservesTheFlightFromTo(String origin, String destination, String departureDate, String returnDate, String name, String lastName, String id) throws Exception {
			actor.attemptsTo(SearchFlight.inThePage(origin, destination, departureDate, returnDate, name, lastName, id));
   
    
}

	@Then("^she should see the data correctly on the screen$")
	public void sheShouldSeeTheDataCorrectlyOnTheScreen() throws Exception {
		actor.should(seeThat(MistakeData.data()));
    
}


	private Consequence seeThat(MistakeData data) {
		
		return null;
	}


}
