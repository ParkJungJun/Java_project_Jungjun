package gui.quiz.register;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame{
	
	final public static Color GREEN = new Color(0x1d6309);
	final public static Color RED = Color.RED;
	
	private static final JLabel pwChkStateField = null;
	JLabel idLabel = new JLabel("아이디");
	JLabel pwLabel = new JLabel("비밀번호");
	JLabel pwChkLabel = new JLabel("비밀번호 확인");
	JLabel nameLabel = new JLabel("이름");
	JLabel socialNumberLabel = new JLabel("주민등록번호");
	JLabel emailLabel = new JLabel("이메일");
	
	JLabel idStateLabel = new JLabel();
	JLabel pwStateLabel = new JLabel();
	JLabel pwChkStateLabel = new JLabel();
	JLabel nameStateLabel = new JLabel();
	JLabel socialNumberStateLabel = new JLabel();
	JLabel emailStateLabel = new JLabel();
	
	JTextField idField = new IdTextField(idStateLabel);
	PwField pwField = new PwField(pwStateLabel);
	JPasswordField pwChkField = new PwChkField(pwField,pwChkStateLabel);
	JTextField nameField = new JTextField();
	JTextField socialNumberField = new JTextField();
	JTextField emailFieled = new JTextField();
	
	JButton duplIdBtn = new IdDuplChkButton(idField, idStateLabel);
	JButton joinBtn = new JoinButton(this);
	
	public RegisterFrame() {
		idLabel.setBounds(10,10,100,30);
		pwLabel.setBounds(10,70,100,30);
		pwChkLabel.setBounds(10,130,100,30);
		nameLabel.setBounds(10,190,100,30);
		socialNumberLabel.setBounds(10,250,100,30);
		emailLabel.setBounds(10,310,100,30);
		
		idStateLabel.setBounds(100,40,300,20);
		pwStateLabel.setBounds(100,100,300,20);
		pwChkStateLabel.setBounds(100,160,100,20);
		nameStateLabel.setBounds(100,220,100,20);
		socialNumberStateLabel.setBounds(100,280,100,20);
		emailStateLabel.setBounds(100,340,100,20);
		
		idField.setBounds(100,10,200,26);
		pwField.setBounds(100,70,200,26);
		pwChkField.setBounds(100,130,200,26);
		nameField.setBounds(100,190,200,26);
		socialNumberField.setBounds(100,250,200,26);
		emailFieled.setBounds(100,310,200,26);
		
		duplIdBtn.setBounds(320,10,100,26);
		joinBtn.setBounds(10,360,90,26);
		add(idLabel);
		add(pwLabel);
		add(pwChkLabel);
		add(nameLabel);
		add(socialNumberLabel);
		add(emailLabel);
		
		add(idStateLabel);
		add(pwStateLabel);
		add(pwChkStateLabel);
		add(nameStateLabel);
		add(socialNumberStateLabel);
		add(emailStateLabel);
		
		add(idField);
		add(pwField);
		add(pwChkField);
		add(nameField);
		add(socialNumberField);
		add(emailFieled);
		
		add(duplIdBtn);
		add(joinBtn);
		
		setTitle("회원가입");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100,100);
		setSize(500,600);
		setVisible(true);
	}
}
