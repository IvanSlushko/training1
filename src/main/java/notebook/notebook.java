package notebook;

import javax.swing.JFrame;


public class notebook {

	public static void main(String[] args) {
		writeNote w = new writeNote ("Notebook");
		w.setVisible(true);  //set window visible
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit
		w.setSize(250, 250);
		w.setResizable(false);// don't resize window
		w.setLocationRelativeTo(null);//in desk center 
	}

}
