package collection;

import java.util.ArrayList;
import java.util.Random;

public class main {
	
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r=new Random();
	
	
	public static void  main (String[] arg){
	
		for (int i=0;i<10;i++){
			mobiles.add(new Mobile (r.nextInt(9999999),"sawwqsAWQ"));
		}
		for (Mobile m: mobiles) {
			System.out.println(m.getNumber()+" "+m.getName());
		}
	
	
	
	
	/**	private static Mobile [] mobiles = new Mobile [3] ;
	
	public static void main(String[] args) {
			
		mobiles[0]= new Mobile(1234567, "iphone");
		mobiles[1]= new Mobile(15247, "sams");	
		mobiles[2]= new Mobile(1423267, "nokia");	
		
		for (Mobile m: mobiles){
			System.out.println(m.getNumber()+" "+m.getName());
		}
		
		
		
		
			for (int i=0;i<mobiles.length;i++){
				for (int k=0;k<mobiles[i].length;k++){
					System.out.print(mobiles[i][k]+" ");
				}System.out.println();
		}
		*/
	}
}
