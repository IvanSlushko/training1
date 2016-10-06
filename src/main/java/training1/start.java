package training1;

import javax.swing.JFrame;

public class start {
	public static void main (String args []){
		Reader r = new Reader ("window name 666");
		r.setVisible(true);  //set window visible
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit
		r.setSize(300, 200);
		r.setResizable(false);// don't resize window
		r.setLocationRelativeTo(null);//in center 
		
		
	}
}
