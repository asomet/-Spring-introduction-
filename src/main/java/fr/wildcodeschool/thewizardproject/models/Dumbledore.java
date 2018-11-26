package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

private Outfit outfit;
	
	public Dumbledore(Outfit theDressColor) {
        outfit = theDressColor;
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
