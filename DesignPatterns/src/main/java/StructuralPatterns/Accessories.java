package StructuralPatterns;

class Accessories extends OutfitDecorator {

	public Accessories(CreatingOutfit c) {
		super(c);
	}
	
	@Override
	public void recreate(){
		super.recreate();
		System.out.print(" Adding accessories to the outfit...");
	}
	
}

