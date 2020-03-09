package CreationalPatterns;
import CreationalPatterns.Factory;
public class FactoryPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Transport waterway = Factory.getDetails("waterways","Ship","vehicles","Mumbai","vizag");
		Transport roadways = Factory.getDetails("roadways","Lorry","cement","Gujarat","NewDelhi");
		System.out.println("Roadway transport details:"+roadways);
		System.out.println("Waterway transport details:"+waterway);
		
		

	}

}
