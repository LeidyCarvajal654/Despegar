package co.com.accenture.technoloshe.despegar.interactios;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll {
	
	public static ScrollToTarget to(Target target) {
		return new ScrollToTarget (target);
	}
	
	public static ScrollToWebElement to(WebElement element) {
		return new ScrollToWebElement (element);
	}

}
