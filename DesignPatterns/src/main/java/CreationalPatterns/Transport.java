package CreationalPatterns;

public abstract class Transport {
	public abstract String getTransportDetails();
	public abstract String getGoodsDetails();
	public abstract String getDestinationDetails();
	public abstract String getSourceDetails();
	@Override
	public String toString(){
		return "TransportType= "+this.getTransportDetails()+", GoodsDetails="+this.getGoodsDetails()+", From="+this.getSourceDetails()+", GoodsDetails="+this.getDestinationDetails();
	}
}


class Roadways extends Transport {

	public String TransportType;
	public String GoodsDetails;
	public String From;
	public String To;
	
	
	public Roadways(String TransportType, String GoodsDetails, String From,String To){
		this.TransportType=TransportType;
		this.GoodsDetails=GoodsDetails;
		this.From=From;
		this.To=To;
	}
	

	@Override
	public String getTransportDetails() {
		// TODO Auto-generated method stub
		return this.TransportType;
	}
	@Override
	public String getGoodsDetails() {
		// TODO Auto-generated method stub
		return this.GoodsDetails;
	}
	@Override
	public String getDestinationDetails() {
		// TODO Auto-generated method stub
		return this.From;
	}
	@Override
	public String getSourceDetails() {
		// TODO Auto-generated method stub
		return this.To;
	}

}

class Waterways extends Transport {

	public String TransportType;
	public String GoodsDetails;
	public String From;
	public String To;
public Waterways(String TransportType, String GoodsDetails, String From,String To){
	this.TransportType=TransportType;
	this.GoodsDetails=GoodsDetails;
	this.From=From;
	this.To=To;
}


@Override
public String getTransportDetails() {
	// TODO Auto-generated method stub
	return this.TransportType;
}
@Override
public String getGoodsDetails() {
	// TODO Auto-generated method stub
	return this.GoodsDetails;
}
@Override
public String getDestinationDetails() {
	// TODO Auto-generated method stub
	return this.From;
}
@Override
public String getSourceDetails() {
	// TODO Auto-generated method stub
	return this.To;
}

}