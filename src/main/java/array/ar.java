package array;

/**     test array & cikl
 *       odnomern
public class ar {
	public static void main(String[] args) {
		int[] m = new int [5]; //new array 5 elements

		for (int x = 0; x < 5; x++) {
			m[x]=x;
			System.out.println(m[x]);
		}
	}
}
*/

public class ar {
	public static void main (String[] args){
		//int [][] m = new  int [3][3];  // 3 str snd 3 stol
		int [][] m = {{1,4,5},{2,8},{3,1,77}};    //vlog cikl
			for (int row = 0; row < m.length; row++) {
				for (int col=0;col<m[row].length;col++){
					System.out.print(m[row][col]+"  ");
					//medlenno vivesti array
					try{
						Thread.sleep(500);
					}catch (Exception e){}// s 500ms
				}
			System.out.println();	
			
			}
	}
}
