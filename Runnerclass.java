import java.util.ArrayList;

public class Runnerclass {
	public static void main(String[] args) {
		// Examples with objects
		Person p1 = new Person("Adeel", 29, "Trainee");
	    Person p2 = new Person("Harry", 35, "Doctor");
	    person p3 = new Person("Chris", 23, "Manager");

	    	System.out.println(p1.age);
	    	System.out.println(p1.name);
	    	System.out.println(p1.jobtitle());
	    	System.out.println(p2.age);
	    	System.out.println(p2.name);
	    	System.out.println(p2.jobtitle());
	    	System.out.println(p3.age);
	    	System.out.println(p3.name);
	    	System.out.println(p3.jobtitle);
	    	
	    	//system.out.println(Adeel.toString());
	    	ArrayList<Person> newlist = new ArrayList();
	    	
	    	//add elements to the array list
	    	newlist.add(Adeel);
	    	newlist.add(Chris);
	    	newlist.add(Harry);
	    	System.out.println(newlist);
	    	
	    	//Use an enhanced for loop to output all of your people to the console.
	    	for (Person person : newlist) {
				System.out.println(person.toString());
				
			//create a method that searches for the person object by their name.
				private static void findPerson(String name, ArrayList<Person> newList) {
					for (Person person : newList) {
					if (person.toString().contains(" name: " + name)) {
					System.out.println("found the person called" + name);	
					
					FindPerson("Adeel", newList);
	private static String FindPerson(String name, ArrayList<Person> newList) {
		for (Person person : newList) {
	}
	    if (person.toString().contains(" Name: " + name)) {
	    	//System.out.println("I found the person called" + name);	
	    }
	    return " I found the person called" + name;
	    }
	return "No name found in the system";
					}

		}

} 



	  