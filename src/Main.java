
public class Main {
	
	public static void main(String[] args) {
		
		// The databse
		DataBase myData = new DataBase();
		
		//String name, String lastName, int age, int id
		// ------------------- Clients ------------------------------
		Client bob = new Client("Bob", "Angle", 20, 1000);
		Client luck = new Client("Luck", "Rock", 17, 1001);
		Client john = new Client("John", "Fox", 16, 1002);
		Client hear = new Client("Hear", "Blink", 47, 1003);
		Client she = new Client("She", "House", 93, 1004);
		
		// -------------- Doctors -----------------------------------
		Doctor jones = new Doctor("Adam", "Jones", 40, 4551);
		Doctor mitch = new Doctor("Mitch", "Rick", 40, 4552);
		Doctor mc = new Doctor("Burger", "McDonald", 40, 4553);
		
		//--------------------- Nurses ---------------------------
		Nurse sis = new Nurse("Angel", "Sis", 40, 3001);
		Nurse carol = new Nurse("Carol", "Water", 40, 3002);
		
		
		bob.assignDoc(jones);
		myData.addPerson(bob);
		myData.addPerson(luck);
		myData.addPerson(john);
		myData.addPerson(she);
		myData.addPerson(hear);
		
	
		
		//myData.search(1000);
		
		
		// Check to see if bob has a doctor, otherwise assigned him to a doctor
//		if(bob.haveDoctor() == true) {
//			
//		}else {
//			bob.assignDoc(jones);
//		}
		
		// Loop through the database to see who doesnt have a nurse or doc or who has one
		
		for(int i = 0; i < myData.myList.size(); i++) {
			if(myData.myList.get(i).haveDoctor() == true){
				System.out.println(i + ": " + myData.myList.get(i).name + " " + myData.myList.get(i).lastName +" has a doc.");
				System.out.println();
			}else {
				System.out.println(i + ": " + myData.myList.get(i).name + " " + myData.myList.get(i).lastName +" does not have a doc.");
				System.out.println();
			}
		}
		
		// ------ Add client's health
		bob.addHealthInfo();
		bob.showHealth();
		
	}
}
