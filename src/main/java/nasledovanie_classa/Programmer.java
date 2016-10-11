package nasledovanie_classa;


                        //(расширяет, наследует)
public class Programmer extends Person {
	
	protected  int progExp =0;

	public int getProgExp() {
		return progExp;
	}

	public void setProgExp(int progExp) {
		this.progExp = progExp;
	}  
	
	public void descriptionOfPerson (){ //переопределение метода
		super.descriptionOfPerson ();
		System.out.println("| I'm programmer & my experience is "+ this.progExp);
		
	}

}
