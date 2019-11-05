package co.com.accenture.technoloshe.despegar.questions;

import co.com.accenture.technoloshe.despegar.userinterfaces.DespegarHomeDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MistakeData implements Question <String>{

	@Override
	public String answeredBy (Actor actor) {
		if (Text.of(DespegarHomeDate.CONFIRMATION_NAME).viewedBy(actor).asString().contains("Leidy")) {
			return "El nombre se ingresó correctamente";
			
		}else {
		
			if (Text.of(DespegarHomeDate.CONFIRMATION_LAST_NAME).viewedBy(actor).asString().contains("Carvajal")) {
				return "El apellido se ingresó correctamente ";
				
			}else
				return "Los datos son incorrectos";
	}

	}

}