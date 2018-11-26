package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
	
	private Outfit outfit;
	
	@Autowired
	public Gandalf(Outfit outfit) {
        this.outfit = outfit;
    }

   @Override
	public String giveAdvice() {
		return "Youhou";
	}

    @Override
    public String changeDress() {
	return this.outfit.dress();
	
    }

}
