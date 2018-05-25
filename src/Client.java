import java.util.Scanner;

public class Client extends Person{
	
	Scanner r = new Scanner(System.in);
	int bloodSugar;
	int weight;
	int height;
	String bloodType = "";
	
	public Client(String name, String lastName, int age, int id) {
		super(name,lastName,age, id);
	}
	
	public void addHealthInfo() {
		
		System.out.print("Please enter in your blood pressure: ");
		bloodSugar = r.nextInt();
		System.out.println("Please enter in your weight: ");
		weight = r.nextInt();
		System.out.println("Please enter in your height: ");
		height = r.nextInt();
		System.out.println("Please enter in your bloodType: ");
		bloodType = r.next();
	}
	
	public void showHealth() {
		System.out.println(name + " " + lastName + "'s information: \n");
		System.out.println("Blood sugar: " + bloodSugar + "\n" +
		"Weight: " + "weight" + "\n" + "Height: " + height + "\n" + "Blood type: " + bloodType + "\n");
	}
	

}
