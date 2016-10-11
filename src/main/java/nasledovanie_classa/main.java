package nasledovanie_classa;

public class main {
	
	public static void main(String[] args) {
	
		//Person person1 = new Person ("johni",22);
		Programmer person2 = new Programmer ();
		//Programmer person2 = new Programmer ();		
		Driver person1 =new Driver ();
		House house = new House ("gorkogo str");
		//house.setAddress ("gorkogo str");

	//	person1.setName ("Petr");
	//	person1.setAge (33);
		
		
		person2.setName ("Kolya");
		person2.setAge (19);
		person2.setProgExp(3);
		person1.setDrExp (7);
		//заселение
		house.settlePerson(person1);
	 	house.settlePerson(person2);	
		
	 	//выселение
		person1.descriptionOfPerson();
		person2.descriptionOfPerson();		
		
		house.descriptionOfHouse();
		

		
		Person.testStatic();//вызвали статич метод
		
	}
}
