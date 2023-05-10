package swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class Admin_page {

	private JFrame frame;
	private JTextField id_textField;
	private JPasswordField pw_passwordField;
	ImageIcon img1 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/E-RAIL.png");
	
	private JPanel login;
	public static String id = "";
	public static String pw = "";
	
	Image img = img1.getImage();
 	Image updateImg = img.getScaledInstance(400, 330, Image.SCALE_SMOOTH);
    ImageIcon updateIcon = new ImageIcon(updateImg);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_page window = new Admin_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		login = new JPanel();
		login.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(login);
		login.setLayout(null);
		
		JLabel id_label = new JLabel("아이디");
		id_label.setFont(new Font("HY헤드라인M", Font.PLAIN, 50));
		id_label.setBounds(510, 440, 200, 100);
		login.add(id_label);
		
		JLabel pw_label = new JLabel("비밀번호");
		pw_label.setFont(new Font("HY헤드라인M", Font.PLAIN, 50));
		pw_label.setBounds(510, 570, 250, 100);
		login.add(pw_label);
		
		id_textField = new JTextField();
		id_textField.setFont(new Font("HY헤드라인M", Font.PLAIN, 50));
		id_textField.setBounds(810, 440, 400, 100);
		login.add(id_textField);
		id_textField.setColumns(10);
		
		pw_passwordField = new JPasswordField();
		pw_passwordField.setFont(new Font("굴림", Font.PLAIN, 50));
		pw_passwordField.setBounds(810, 570, 400, 100);
		login.add(pw_passwordField);
		
		JButton check_btn = new JButton("로그인");
		check_btn.setForeground(Color.WHITE);
		check_btn.setBackground(new Color(0, 128, 192));
		check_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				id = id_textField.getText();
				pw = pw_passwordField.getText();
				
				Admin_pageDAO dao = new Admin_pageDAO();
				boolean login_result = dao.login_chk();
				System.out.println(login_result);
			}	
		});
		check_btn.setFont(new Font("HY헤드라인M", Font.PLAIN, 60));
		check_btn.setBounds(500, 730, 700, 100);
		login.add(check_btn);
		
		JLabel E_RAIL = new JLabel(updateIcon);
		E_RAIL.setBounds(750, 35, 400, 330);
		login.add(E_RAIL);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
