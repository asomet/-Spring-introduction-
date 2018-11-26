package fr.wildcodeschool.thewizardproject.models;
import org.springframework.stereotype.Component;

@Component("DumbledoreId")

public class Dumbledore implements WizardInterface {


   @Override
	public String giveAdvice() {
		return "Youhou";
	}

    @Override
    public String changeDress() {
	return "Abracadabra";
	
    }

}
