package notebook;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import training1.Reader.eHandler;

/**
 * 
 * ������� ����� 
 *
 */
public class writeNote extends JFrame {

	JButton b1,b2,b3,b4;
	JTextField t1,t2;
	JLabel l1,l2;
	eHandler handler = new eHandler();
	int c;
	public writeNote (String s){
		super(s);
		setLayout(new FlowLayout ());

		b1=new JButton ("�������� ������");
		b2=new JButton ("������� ������");
		b3=new JButton ("������������� ������");
		b4=new JButton ("���������� ��� ������");		
		t1= new JTextField (20);
		t2= new JTextField (10); // ����� � ������� �� ��������
		l1=new JLabel ("������� ������:");
		l2=new JLabel ("� � ������� ��� ����. ��� �������.:");
		JTextField textField;
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
 * ������� ���������
 *
 */
	
	public class eHandler implements ActionListener {
		
		ArrayList<String> list = new ArrayList<String>();//������� ������ ��� ���� ������
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==b1) { //��������
				list.add(t1.getText()); //��������� � ������
                System.out.println(list.subList(0, list.size()));
                t1.setText("");
			}
			
			if (e.getSource()==b2){ //�������
				c = Integer.parseInt(t2.getText());
				list.remove(c);
				t2.setText("");
			}
			
			if (e.getSource()==b3){ //�������������
				c = Integer.parseInt(t2.getText());
				list.set(c, t1.getText());
				t1.setText("");
				t2.setText("");
			}
			
			if (e.getSource()==b4){ //����������
				JOptionPane.showMessageDialog (null, list);
			}
		  
		}
		
	}
	
	
	
	
}
