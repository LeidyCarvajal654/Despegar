package co.com.accenture.technoloshe.despegar.tasks;



import co.com.accenture.technoloshe.despegar.interactios.Scroll;
import co.com.accenture.technoloshe.despegar.interactios.WaitSeconds;
import co.com.accenture.technoloshe.despegar.userinterfaces.DespegarHomeDate;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFlight implements Task {
	
	private String origin;
	private String destination;
	private String departureDate;
	private String returnDate;
	private String name;
	private String lastName;
	private String id;
	

	public SearchFlight (String origin, String destination,String departureDate,String returnDate,String name, String lastName, String id) {
		this.origin=origin;
		this.destination= destination;
		this.departureDate= departureDate;
		this.returnDate=returnDate;
		this.name=name;
		this.lastName=lastName;
		this.id=id;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Click.on(DespegarHomeDate.X));	
	actor.attemptsTo(Click.on(DespegarHomeDate.FLIGHT_OPTION));
				
				Click.on(DespegarHomeDate.ORIGIN_CITY);
				Enter.theValue(origin).into(DespegarHomeDate.ORIGIN_CITY);
				
				Click.on(DespegarHomeDate.DESTINATION_CITY);
				Enter.theValue(destination).into(DespegarHomeDate.DESTINATION_CITY);
				
				Click.on(DespegarHomeDate.DEPARTURE_DATE);
				Click.on(DespegarHomeDate.DEPARTURE_DATE.of(departureDate));
				Click.on(DespegarHomeDate.ARRIVE_DATE.of(returnDate));
				Click.on(DespegarHomeDate.SEARCH);
				
	actor.attemptsTo(WaitSeconds.inThePage(10), Scroll.to(DespegarHomeDate.SELECT));	
				Click.on(DespegarHomeDate.SELECT);  WaitSeconds.inThePage(50);
				Click.on(DespegarHomeDate.PAYMENT); Scroll.to(DespegarHomeDate.FIRST_NAME);
				Click.on(DespegarHomeDate.FIRST_NAME); Enter.theValue(name).into(DespegarHomeDate.FIRST_NAME);
				Click.on(DespegarHomeDate.LAST_NAME); Enter.theValue(lastName).into(DespegarHomeDate.LAST_NAME);
				Click.on(DespegarHomeDate.DOCUMENT); Enter.theValue(id).into(DespegarHomeDate.DOCUMENT);
				Scroll.to(DespegarHomeDate.CONFIRMATION);
				
	}
	
	public static SearchFlight inThePage (String origin, String destination,String departureDate,String returnDate,String name, String lastName, String id) {
		return Tasks.instrumented(SearchFlight.class, origin,destination,departureDate,returnDate,name,lastName,id);
	}

}
