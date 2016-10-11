package nasledovanie_classa;

import java.util.ArrayList;

public class House {

	protected String address = "n/a";
	protected ArrayList <Person> listOfResidents = new ArrayList <Person>();

	public House (){}
	
	public House (String address){
		this.address = address;
	}
	public String address(){
		return address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}	
	
	
	public void settlePerson(Person p) {//заселение чела
		if (listOfResidents.contains(p)){// проверяем живет ли уже чел
			System.out.println("He live here olredy ");
		} else {
			listOfResidents.add(p);
			p.setAddress(address);}
		}
			
	public void evictPerson (Person p) {//выселение чела
			listOfResidents.remove(p);
			p.setAddress("n/a");
		}	
	
	public void descriptionOfHouse () {//выселение чела	
		System.out.println("-------------------");	
		System.out.println("# Address of this house is :"+address);
		System.out.println("# List of residents :");
		
		if (listOfResidents!= null){
			for (int i = 0; i<listOfResidents.size(); i++){
				Person p = listOfResidents.get(i);
				System.out.println("#  -"+p.name);
			}
		}
		
		}	
	
}
