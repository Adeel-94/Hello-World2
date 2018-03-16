import java.util.Arraylist;
import java.util.collection;

public class Garage {
	
	public static void main(String[] args) {
		
		Arraylist<Vehicle> mygarage = new Arraylist();
		
		Car Car1 = new Car ("2500", "2010", "BMW", "5", "150"); 
		car Car2 = new car ("2000", "2014", "Audi","5", "130");
		car Car3 = new car ("1800", "2017", "Honda", "5", "130");
		
		Motorbike Motorbike 1 = new Motorbike ("1900", "2008", "Honda", "2", "100"); 
		Motorbike Motorbike 2 = new Motorbike ("5000", "2017", "Yamaha","2", "110");
		Motorbike Motorbike 3 = new Motorbike ("1200", "2015", "Suzuki", "2", "90");
		
		Van Van 1 = new Van ("2400", "2011", "Ford", "3", "130"); 
		Van Van 2 = new Van ("2200", "2012", "Citreon","3", "120");
		Van Van 3 = new Van ("1900", "2016", "Renault", "3", "110");
		
		
	mygarage.add(Car 1);
	mygarage.add(Car 2);
	mygarage.add(Car 3);
	mygarage.add(Motorbike 1);
	mygarage.add(Motorbike 2);
	mygarage.add(Motorbike 3);
	mygarage.add(Van 1);
	mygarage.add(Van 2);
	mygarage.add(Van 3);
	
	
	for(Vehicle myVehicle: mygarage) {
		System.out.println(myVehicle);
	}
	
	}
	

}
