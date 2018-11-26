package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private Outfit outfit;
	
	public Gandalf(Outfit theDressColor) {
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
