package BehavioralPattern;

import  BehavioralPattern.BrickHouse;
import BehavioralPattern.HouseTemplate;
import BehavioralPattern.WoodenHouse;
public class TemplatePattern {

public static void main(String[] args) {
		
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		System.out.println("------------------------");
		
		houseType = new BrickHouse();
		
		houseType.buildHouse();
	}
	
	
}
