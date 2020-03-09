package CreationalPatterns;

import java.util.ArrayList;
import java.util.List;

public class CarModels implements Cloneable{

	private List<String> carList;
	
	public CarModels(){
		carList = new ArrayList<String>();
	}
	
	public CarModels(List<String> list){
		this.carList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		carList.add("wheels");
		carList.add("brakes");
		carList.add("engine");
		carList.add("alternator");
		carList.add("radiator");
		carList.add("suspension");
		carList.add("ignition system");
	}
	
	public List<String> getCarList() {
		return carList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getCarList()){
				temp.add(s);
			}
			return new CarModels(temp);
	}

}
