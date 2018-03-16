
public class Person {
	public void main (String[] args)
	
	//attributes
	private String name;
	private int age;
	private String jobtitle;
	
	//constructor - state of the object
	public Person(String name, int age, String jobtitle) {
		super();
		this.name = name; 
	    this.age = age;
	    this.setJobtitle(jobtitle);
	}
	public String toString () {
		return "Name:" +name + "Age:" + age + "Jobtitle:" + getJobtitle();
	}
	
}


//method 
	public void startwork() {
		System.out.println(work)
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}