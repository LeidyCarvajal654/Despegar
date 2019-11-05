package co.com.accenture.technoloshe.despegar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DespegarHomeDate extends PageObject{
	
	public static final Target X = Target.the("X").locatedBy("//*[@class=\"tooltip-close dreck-3-icon-close incentive-close\"]");
	public static final Target FLIGHT_OPTION = Target.the("Select flights tab").locatedBy("/html/body/nav/div[2]/div[1]/div[3]/ul/li[1]/a/div/i");
	public static final Target ORIGIN_CITY = Target.the("Select the city of origin").locatedBy("//*[@class='validation-msg']//*[text()='Ingresa un origen']");		
	public static final Target DESTINATION_CITY = Target.the("Select the destination").locatedBy("//*[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");	
	
	public static final Target DEPARTURE_DATE = Target.the("Select Date of departure").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[15]/span[1])[contains(text(),'{0}')]");	
	public static final Target ARRIVE_DATE = Target.the("Select Arrival of date").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[18]/span[1])[contains(text(),'{0}')]");
	public static final Target SEARCH = Target.the("Search Flight").locatedBy("//*[@class=\"input-icon sbox-3-icon-search sbox-ui-icon-search\"]");
		
	public static final Target SELECT = Target.the("Select Flight option").locatedBy("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/div[2]/fare/span/span/div/buy-button/a/div/em");
	public static final Target PAYMENT = Target.the("Way to pay").locatedBy("//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/ul/li[6]/p/label/i");
	
	public static final Target FIRST_NAME = Target.the("Enter the name").locatedBy("//*[@class=\"input-tag traveler-first-name ng-pristine ng-invalid ng-touched\"]");
	public static final Target LAST_NAME = Target.the("Enter the last name").locatedBy("//*[@class=\"input-tag traveler-last-name ng-pristine ng-invalid ng-touched\"]");
	public static final Target DOCUMENT = Target.the("Enter the id ").locatedBy("//*[@class=\"formData.travelers[0].identifications[0].number\"]");
	public static final Target CONFIRMATION = Target.the("Confirmation of data").locatedBy("//*[@id=\"checkout-content\"]/div[1]/buy-component/div/flight-data-revision/div/div[1]");
	public static final Target CONFIRMATION_NAME = Target.the("").locatedBy("\"//*[@class='eva-3-body-2 value']//*[text()='leidy']\"");
	public static final Target CONFIRMATION_LAST_NAME = Target.the("").locatedBy("\"//*[@class='eva-3-body-2 value']//*[text()='Carvajal']\"");
	
}