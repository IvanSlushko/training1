package Task3_Nasledovanie;

import java.util.ArrayList;

public class Novichek {

	protected String name = "n/a";
	protected int age = 0;
	protected ArrayList <Novichek> nov = new ArrayList <Novichek>();
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Novichek> getNov() {
		return nov;
	}
	
	
	public void outnov (){
		System.out.println("| My name is: "+ name);
		System.out.println("| I'm "+age+ " let");

	}
//		for (int i = 0;i<nov.size();i++){
		
	//	}
		
		//	System.out.println("Name is: "+ name);
		//	System.out.println("Age: "+age);

		
	

	
}
