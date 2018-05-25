import java.util.ArrayList;

public class DataBase {

	ArrayList<Person>myList = new ArrayList<Person>();
	
	public DataBase() {
		
	}
	
	public void addPerson(Person person) {
		myList.add(person);
	}
	
	public void search(int id) {
		for(int i = 0; i < myList.size(); i++) {
			if(myList.get(i).id == id) {
				System.out.println(myList.get(i).showInfo());
			}
		}
	}
	
	
}
