package StructuralPatterns;

class OutfitDecorator implements CreatingOutfit {

	public CreatingOutfit outfit;
	
	public OutfitDecorator(CreatingOutfit c){
		this.outfit=c;
	}
	public void recreate() {
		this.outfit.recreate();
	}

}


