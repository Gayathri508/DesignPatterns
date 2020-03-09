package StructuralPatterns;


import StructuralPatterns.CreatingOutfit;
import StructuralPatterns.BasicOutfit;
import StructuralPatterns.Coat;
import StructuralPatterns.Accessories;
public class DecorativePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreatingOutfit coat = new Coat(new BasicOutfit());
		coat.recreate();
		System.out.println("\n---------------------------------");
		
		CreatingOutfit accessories = new Coat(new Accessories(new BasicOutfit()));
		accessories.recreate();
		
		
	}

}
