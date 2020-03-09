package CreationalPatterns;


import  CreationalPatterns.Transport;
import  CreationalPatterns.Roadways;
import  CreationalPatterns.Waterways;


public class Factory {

		public static Transport getDetails(String type,String TransportType, String GoodsDetails, String From, String To){
			if("Roadways".equalsIgnoreCase(type)) return new Roadways(TransportType, GoodsDetails, From, To);
			else if("Waterways".equalsIgnoreCase(type)) return new Waterways(TransportType, GoodsDetails, From, To);
			
			return null;
		}

		
	
}
