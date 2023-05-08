package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class S07_JPasswordField extends JFrame {
	//비밀번호를 입력할 때 사용하는 필드
	public S07_JPasswordField() {
		JLabel id_label = new JLabel("ID :");
		JTextField id_field = new JTextField();
		
		id_label.setBounds(50, 10, 50, 30);
		id_field.setBounds(100,10, 200, 30 );
		
		JLabel pw_label = new JLabel("Password : ");
		JPasswordField pw_field = new JPasswordField();
		
		pw_label.setBounds(20, 50, 80, 30);
		pw_field.setBounds(100,50, 200, 30 );
		
		add(id_label);
		add(id_field);
		add(pw_label);
		add(pw_field);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}	 
	
	public static void main(String[] args) {
		new S07_JPasswordField();
	}
}
