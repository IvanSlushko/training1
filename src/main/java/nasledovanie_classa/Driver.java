package nasledovanie_classa;

public class Driver extends Person {
	
	protected int drExp  =0;

	public int DrExp() {
		return drExp;
	}

	public void setDrExp(int progExp) {
		this.drExp = progExp;
	}
	
	public void descriptionOfPerson (){ //переопределение метода
		super.descriptionOfPerson ();
		System.out.println("| I'm a driver & my experience is "+ this.drExp);
		
	}
}
