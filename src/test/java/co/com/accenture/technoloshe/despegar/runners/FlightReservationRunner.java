package co.com.accenture.technoloshe.despegar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features= "src\\test\\resources\\features\\flightreservation.feature",
		glue= "co.com.accenture.technoloshe.despegar.stepdefinitions",
		snippets= SnippetType.CAMELCASE
		)	

public class FlightReservationRunner {

}
