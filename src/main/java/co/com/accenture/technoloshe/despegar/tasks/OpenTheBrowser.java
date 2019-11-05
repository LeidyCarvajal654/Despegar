package co.com.accenture.technoloshe.despegar.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {
	PageObject page;

public OpenTheBrowser (PageObject page) {
		this.page = page;
}
	@Override
	@Step ("{0} opens the browser on Despegar Main Page ")
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(page));		
	}

	public static OpenTheBrowser on (PageObject page) {
		return Tasks.instrumented(OpenTheBrowser.class, page);
	}
}
