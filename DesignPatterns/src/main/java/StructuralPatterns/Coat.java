package StructuralPatterns;

class Coat extends OutfitDecorator {

	public Coat(CreatingOutfit c) {
		super(c);
	}

	@Override
	public void recreate(){
		super.recreate();
		System.out.print(" Adding coat to the outfit ....");
	}
}
