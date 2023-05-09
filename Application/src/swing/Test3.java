package swing;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import back.Main;
import javax.swing.SwingConstants;

public class Test3 extends JFrame {

	private JPanel contentPane;
	private JTextField id_textField;
	private JPasswordField pw_passwordField;
	private JTextField id_textField_2;
	private JPasswordField pw_passwordField_2;
	private JTextField name_textField;
	private JTextField phone_textField;
	private JTextField birthday_textField;
	private JTextField email_textField;
	
	public static String id = "";
	public static String pw = "";
	
	public static String id2 = "";
	public static String pw2 = "";
	public static String name = "";
	public static String phone_number = "";
	public static String birthday = "";
	public static String email = "";
	
	public static String pw_alrim_str = "";
	public static String email_alrim_str = "";
	public static String number_alrim_str = "";
	public static String birthday_alrim_str = "";
	
	public static boolean pw_chk_B = false;
	public static boolean email_chk_B = false;
	public static boolean num_chk_B = false;
	public static boolean birthday_chk_B = false;
	
	
	
	ImageIcon img1 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/join_finish.PNG");
	ImageIcon img2 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/chk_overlap.PNG");	
	ImageIcon img3 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/E-RAIL.png");
	ImageIcon img4 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/login.PNG");
	ImageIcon img5 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/login_page.PNG");
	ImageIcon img6 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/join_page.PNG");
	
	Image img = img3.getImage();
 	Image updateImg = img.getScaledInstance(400, 330, Image.SCALE_SMOOTH);
    ImageIcon updateIcon = new ImageIcon(updateImg);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public Test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1800, 850);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		layeredPane.add(login, "name_29419370275400");
		login.setLayout(null);
		
		JLabel id_label = new JLabel("아이디 :");
		id_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 50));
		id_label.setBounds(510, 440, 200, 100);
		login.add(id_label);
		
		JLabel pw_label = new JLabel("비밀번호 :");
		pw_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 50));
		pw_label.setBounds(510, 570, 250, 100);
		login.add(pw_label);
		
		id_textField = new JTextField();
		id_textField.setFont(new Font("굴림", Font.PLAIN, 50));
		id_textField.setBounds(810, 440, 400, 100);
		login.add(id_textField);
		id_textField.setColumns(10);
		
		pw_passwordField = new JPasswordField();
		pw_passwordField.setFont(new Font("굴림", Font.PLAIN, 50));
		pw_passwordField.setBounds(810, 570, 400, 100);
		login.add(pw_passwordField);
		
		JButton check_btn = new JButton(img4);
		check_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				id = id_textField.getText();
				pw = pw_passwordField.getText();
				
				Test3DAO dao = new Test3DAO();
				boolean login_result = dao.login_chk();
				System.out.println("로그인 성공 여부" + login_result);
			}	
		});
		check_btn.setFont(new Font("굴림", Font.PLAIN, 60));
		check_btn.setBounds(550, 730, 637, 87);
		login.add(check_btn);
		
		JLabel E_RAIL = new JLabel(updateIcon);
		E_RAIL.setBounds(750, 35, 400, 330);
		login.add(E_RAIL);
		
		JPanel join = new JPanel();
		layeredPane.add(join, "name_29419379635300");
		join.setLayout(null);
		
		JLabel join_label = new JLabel("회원가입");
		join_label.setHorizontalAlignment(SwingConstants.CENTER);
		join_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 70));
		join_label.setBounds(85, 10, 400, 200);
		join.add(join_label);
		
		JLabel id_label_2 = new JLabel("아이디 :");
		id_label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		id_label_2.setBounds(550, 150, 200, 75);
		join.add(id_label_2);
		
		JLabel pw_label_2 = new JLabel("비밀번호 :");
		pw_label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		pw_label_2.setBounds(550, 235, 200, 75);
		join.add(pw_label_2);
		
		id_textField_2 = new JTextField();
		id_textField_2.setFont(new Font("굴림", Font.PLAIN, 40));
		id_textField_2.setColumns(10);
		id_textField_2.setBounds(800, 150, 400, 75);
		join.add(id_textField_2);
		
		pw_passwordField_2 = new JPasswordField();
		pw_passwordField_2.setFont(new Font("굴림", Font.PLAIN, 40));
		pw_passwordField_2.setBounds(800, 235, 400, 75);
			
		join.add(pw_passwordField_2);
		
		JLabel name_label = new JLabel("이름 :");
		name_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		name_label.setBounds(550, 320, 200, 75);
		join.add(name_label);
		
		JLabel phone_label = new JLabel("전화번호 :");
		phone_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		phone_label.setBounds(550, 485, 250, 75);
		join.add(phone_label);
		
		name_textField = new JTextField();
		name_textField.setFont(new Font("굴림", Font.PLAIN, 40));
		name_textField.setBounds(800, 320, 400, 75);
		join.add(name_textField);
		name_textField.setColumns(10);
		
		phone_textField = new JTextField();
		phone_textField.setFont(new Font("굴림", Font.PLAIN, 40));
		phone_textField.setBounds(800, 485, 400, 75);
		join.add(phone_textField);
		phone_textField.setColumns(10);
		
		JLabel birthday_label = new JLabel("생년월일 :");
		birthday_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		birthday_label.setBounds(550, 400, 200, 75);
		join.add(birthday_label);
		
		JLabel email_label = new JLabel("이메일 :");
		email_label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		email_label.setBounds(550, 570, 250, 75);
		join.add(email_label);
		
		birthday_textField = new JTextField();
		birthday_textField.setFont(new Font("굴림", Font.PLAIN, 40));
		birthday_textField.setBounds(800, 405, 400, 75);
		join.add(birthday_textField);
		birthday_textField.setColumns(10);
		
		email_textField = new JTextField();
		email_textField.setFont(new Font("굴림", Font.PLAIN, 40));
		email_textField.setBounds(800, 570, 400, 75);
		join.add(email_textField);
		email_textField.setColumns(10);
		
		JButton check_btn_2 = new JButton(img1);
//		check_btn_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				id2 = id_textField_2.getText();
//				pw2 = pw_passwordField_2.getText();
//				name = name_textField.getText();
//				phone_number = phone_textField.getText();
//				birthday = birthday_textField.getText();
//				email = email_textField.getText();
//				
//				JoinDAO dao2 = new JoinDAO();
//				boolean join_result = dao2.join_chk();
//				System.out.println("회원가입 성공 여부 : " + join_result);
//				}
//		});
		check_btn_2.setFont(new Font("굴림", Font.PLAIN, 60));
		check_btn_2.setBounds(650, 675, 699, 83);
		join.add(check_btn_2);
		
		JButton chk_overlap_btn = new JButton(img2);
		chk_overlap_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id2 = id_textField_2.getText();
				CheckDAO dao3 = new CheckDAO();
				dao3.id_check();
			}
		});
		chk_overlap_btn.setFont(new Font("굴림", Font.PLAIN, 20));
		chk_overlap_btn.setBounds(1250, 160, 179, 60);
		join.add(chk_overlap_btn);
		
		JLabel pw_alrim = new JLabel();
		pw_alrim.setFont(new Font("굴림", Font.PLAIN, 15));
		pw_alrim.setBounds(1250, 235, 500, 60);
		join.add(pw_alrim);
		
		JLabel email_alrim = new JLabel();
		email_alrim.setFont(new Font("굴림", Font.PLAIN, 20));
		email_alrim.setBounds(1250, 570, 400, 60);
		join.add(email_alrim);
		
		JLabel number_alrim = new JLabel();
		number_alrim.setFont(new Font("굴림", Font.PLAIN, 20));
		number_alrim.setBounds(1250, 485, 400, 60);
		join.add(number_alrim);
		
		JLabel birthday_alrim = new JLabel();
		birthday_alrim.setFont(new Font("굴림", Font.PLAIN, 20));
		birthday_alrim.setBounds(1250, 400, 400, 60);
		join.add(birthday_alrim);
		
		JButton login_btn = new JButton(img5);
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(login);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		login_btn.setFont(new Font("굴림", Font.PLAIN, 70));
		login_btn.setBounds(220, 880, 636, 84);
		contentPane.add(login_btn);
		
		JButton join_btn = new JButton(img6);
		join_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(join);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		pw_passwordField_2.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				PW_chk pw = new PW_chk();
				pw2 = pw_passwordField_2.getText();
				if(pw.pw_chk(pw2)) {
					pw_alrim.setText("사용 가능한 비밀번호입니다");
					pw_chk_B = true;
				}else {
					pw_alrim.setText("6자리이상 영어 대문자,소문자,숫자,특수문자를 포함하세요");
				}
//				pw_alrim.setText(pw.pw_chk(pw2));
//				pw_alrim_str = pw_alrim.getText();
			}
		});
		
		email_textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				email = email_textField.getText();
				Email_chk email_1 = new Email_chk();
				if(email_1.email_chk(email)) {
					email_alrim.setText("이메일을 정확히 입력하셨습니다");
					email_chk_B = true;
				}else {
					email_alrim.setText("이메일을 정확히 입력하세요");
				}
//				email_alrim.setText(email_1.email_chk(email));
//				email_alrim_str = email_alrim.getText();
			}
		});
		
		phone_textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				phone_number = phone_textField.getText();
				Number_chk number_1 = new Number_chk();
				if(number_1.number_chk(phone_number)) {
					number_alrim.setText("올바른 전화번호입니다");
					num_chk_B = true;
				}else {
					number_alrim.setText("-를 포함하여 입력하세요");
				}
//				number_alrim.setText(number_1.number_chk(phone_number));
//				number_alrim_str = number_alrim.getText();
			}
		});
		
		birthday_textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				birthday = birthday_textField.getText();
				Birthday_chk chk_birthday = new Birthday_chk();
				if(chk_birthday.birthday_chk(birthday)) {
					birthday_alrim.setText("올바른 생년월일입니다");
					birthday_chk_B = true;
				}else {
					birthday_alrim.setText("-를 포함하여 올바른 값을 입력하세요");
				}
//				birthday_alrim.setText(chk_birthday.birthday_chk(birthday));
//				birthday_alrim_str = birthday_alrim.getText();
			}
		});
		
		check_btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id2 = id_textField_2.getText();
				pw2 = pw_passwordField_2.getText();
				name = name_textField.getText();
				phone_number = phone_textField.getText();
				birthday = birthday_textField.getText();
				email = email_textField.getText();
				
				JoinDAO dao2 = new JoinDAO();
				boolean join_result = dao2.join_chk();
				System.out.println("회원가입 성공 여부 : " + join_result);
				}
		});
		
		join_btn.setFont(new Font("굴림", Font.PLAIN, 70));
		join_btn.setBounds(920, 880, 636, 84);
		contentPane.add(join_btn);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
