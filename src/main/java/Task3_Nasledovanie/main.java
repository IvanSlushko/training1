package Task3_Nasledovanie;

public class main {

	public static void main(String[] args) {
		
		Novichek nov1 = new Novichek ();
		Novichek nov2 = new Novichek ();		
		Novichek nov3 = new Novichek ();		

		nov1.setName("Petr");		
		nov1.setAge(6);
		nov2.setName("Yura");		
		nov2.setAge(7);
		nov3.setName("Ann");		
		nov3.setAge(6);
		
		Bumaga bum1= new Bumaga();
		bum1.setBum("Notepad");
		Bumaga bum2= new Bumaga();
		bum2.setBum("paper");		
		
		Pensil pen1 = new Pensil();
		pen1.setPen("Karandash"); 
		Pensil pen2 = new Pensil();		
		pen2.setPen("Flomaster"); 

		nov1.outnov();
		System.out.println("| I used "+pen1.getPen()+" and "+bum2.getBum());
		System.out.println("|_______________________________________________");
		nov2.outnov();
		System.out.println("| I used "+pen2.getPen()+" and "+bum2.getBum());
		System.out.println("|_______________________________________________");
		nov3.outnov();
		System.out.println("| I used "+pen1.getPen()+" and "+bum1.getBum());
		System.out.println("|_______________________________________________");
	}

}
