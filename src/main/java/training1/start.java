package training1;

public class start {

	public static void main(String[] args) {
		Reader r= new Reader();
		r.Scan();
		r.i=count (r.i);
		r.k=count (r.k);		
		System.out.println ("new 1 =" + r.i);
		System.out.println ("new 2 =" + r.k); 		
	}
	
	private static int count (int x){
		x = x + 1;
		return x;
		
	}
	
	
}
