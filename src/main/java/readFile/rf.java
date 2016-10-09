package readFile;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;

public class rf {
	static String [][] m = new String [5][3];	
	static Scanner scn;

	public static void main (String args[]){
		openfile ();
		readfile ();
		out ();
	}

	private static void out() {    //vivod na ekran
		for (int row=0;row<m.length;row++){
			for (int col=0;col<m[row].length;col++){
				//m[row][col]=scn.next();
				System.out.print(m[row][col]+"   ");
			}
		System.out.println();	
		}
	}
	
	private static void readfile() { //zanesenie iz file v massive
		while (scn.hasNext()){
			for (int row=0;row<m.length;row++){
				for (int col=0;col<m[row].length;col++){
				m [row][col] =scn.next();
				}
			}
		}
	}
	
	private static void openfile() { //open file
		try {
		scn = new Scanner (new File("res//1.txt"));
		}catch (Exception e) {JOptionPane.showMessageDialog(null, "File not found");}
	}
	
	
	
	
}
