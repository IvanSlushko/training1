package training1;

//import java.util.*;
import javax.swing.JOptionPane;

public class Reader {
	int i,k;
	String n1,n2;
		
	//int k;

	public void Scan() {
		
		n1= JOptionPane.showInputDialog("Введите первое число");
		n2= JOptionPane.showInputDialog("Введите второе число");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
			
		//System.out.println("input 1: ");
		//Scanner scn = new Scanner(System.in);
		//i = scn.nextInt();
		//System.out.println("input 2: ");
		//k = scn.nextInt();
	}

	public void Scan(int a, int b) {
		
		JOptionPane.showMessageDialog(null, "Теперь ваше первое число = " +a);
		JOptionPane.showMessageDialog(null, "Теперь ваше второе число = " +b);			
		
	}
	
	
	
}
