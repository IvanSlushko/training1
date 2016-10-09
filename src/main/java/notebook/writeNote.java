package notebook;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * создаем форму 
 *
 */
public class writeNote extends JFrame {

	/**
	 * сериализаци€
	 */
	private static final long serialVersionUID = 1L;
	
	JButton b1,b2,b3,b4;
	JTextField t1,t2;
	JLabel l1,l2;
	eHandler handler = new eHandler();
	int c;
	public writeNote (String s){
		super(s);
		setLayout(new FlowLayout ());

		b1=new JButton ("ƒобавить запись");
		b2=new JButton ("”далить запись");
		b3=new JButton ("–едактировать запись");
		b4=new JButton ("ѕосмотреть все записи");		
		t1= new JTextField (20);
		t2= new JTextField (10); // номер в массиве на удаление
		l1=new JLabel ("¬ведите запись:");
		l2=new JLabel ("є в массиве дл€ удал. или коррекц.:");
		//JTextField textField;
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (l1);
		add (t1);
		add (l2);		
		add (t2);
		b2.addActionListener (handler);
		b1.addActionListener (handler);
		b3.addActionListener (handler);
		b4.addActionListener (handler);
	}
/**
 * создаем слушател€
 *
 */
	public class eHandler implements ActionListener {
		
		ArrayList<String> list = new ArrayList<String>();//создаем массив как поле класса
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b1) { //добавить
				list.add(t1.getText()); //добавл€ем в массив
                System.out.println(list.subList(0, list.size()));
                t1.setText("");
			}
			if (e.getSource()==b2){ //удалить
				c = Integer.parseInt(t2.getText());
				list.remove(c);
				t2.setText("");
			}
			if (e.getSource()==b3){ //редактировать
				c = Integer.parseInt(t2.getText());
				list.set(c, t1.getText());
				t1.setText("");
				t2.setText("");
			}
			if (e.getSource()==b4){ //посмотреть
				JOptionPane.showMessageDialog (null, list);
			}
		}
	}
}
