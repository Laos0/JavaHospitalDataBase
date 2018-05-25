
public abstract class Person {
	
	
	public String name = "";
	public String lastName = "";
	public int age = 0;
	public int id = 0;
	private boolean haveDoc = false;
	private boolean haveNur = false;
	
	
	public Person(String name, String lastName, int age, int id) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
	}
	
	public String showInfo() {
		return "Name: " + name + "\n" + 
		"Last Name: " + lastName + "\n" +
		"Age: " + age + "\n" +
		"ID: " + id + "\n";
	}
	
	//============================
	public void assignDoc(Person doc) {
		System.out.println(name + "'s doctor is: " + doc.name + " " + doc.lastName);
		haveDoc = true;
	}
	
	public void assignNur(Person nur) {
		System.out.println(name + "'s nurse is: " + nur.name + " " + nur.lastName);
		haveNur = true;
	}
	
	public boolean haveDoctor() {
		
		if(haveDoc == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean haveNurse() {
			
		if(haveNur == true) {
			return true;
		}else {
			return false;
		}
	}
	
	//================================
}
