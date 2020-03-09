package CreationalPatterns;

import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		CarModels emps = new CarModels();
		emps.loadData();
		CarModels NewComponentsadded = (CarModels) emps.clone();
		CarModels moreNewComponentsadded = (CarModels) emps.clone();
		List<String> list = NewComponentsadded.getCarList();
		list.add("steering");
		list.add("side mirrors");
		list.add("seats");
		list.add("new colour");
		List<String> list1 =  moreNewComponentsadded .getCarList();
		list1.remove("new colour");
		
		System.out.println("Basic components: "+emps.getCarList());
		System.out.println("NewComponentsadded: "+list);
		System.out.println("moreNewComponentsadded: "+list1);
		
	}

}
