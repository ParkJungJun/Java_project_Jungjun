package gui.quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;


public class S07_Register extends JFrame{
	/*
	 	회원가입 창 만들기
	 	
	 	(1) 아이디, 비밀번호, 비밀번호 확인, 이름, 주민등록 번호(123456-1xxxxx), 이메일
	 	
	 	(2) 아이디 중복 체크 기능을 구현해야한다.
	 		중복체크를 진행하지 않으면 회원가입 버튼을 누를 때 경고가 나와야 한다.
	 	
	 	(3) 회원가입 버튼을 눌렀을 때 입력한 내용들이 올바르지 않다면
	 	  	올바르지 않은 곳에 빨간 글씨로 올바르지 않은 이유를 설명해줘야 한다.
	 	  	
	 	(4) 회원가입 버튼을 눌렀을 때 모든 값들이 올바르다면 DB에 회원 정보를 저장한다.
	 	
	 	(5) 비밀번호는 영어대문자, 소문자, 특수문자가 최소 하나 이상씩 포함되어 있어야하며
	 	    6글자 이상이어야 한다.(언어는 영어만 허용)
	 	    
	 	(6) 비밀번호와 비밀번호확인은 회원가입 버튼을 눌렀을 때 확인 하는것이 아니라
	 		키보드를 입력할 때마다 메세지가 실시간으로 변해야한다.
	 */
	private Member_Join_DAO dao = new Member_Join_DAO();
	private List<Member_Join_DTO> dto = new ArrayList<>();
	
	public S07_Register() {
		JLabel message = new JLabel();
		message.setBounds(70, 250, 200, 30);
		add(message);
		
		JLabel id_label = new JLabel("ID :");
		JTextField id_field = new JTextField();
		
		id_label.setBounds(50, 10, 50, 30);
		id_field.setBounds(100,10, 200, 30 );
		add(id_label);
		add(id_field);
		
		JButton id_chk_btn = new JButton("중복체크");
		id_chk_btn.setBounds(330, 10, 100, 30);
		id_chk_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id_text = id_field.getText();
				String id_chk_message = dao.id_dupli_chk(id_text);
				message.setText(id_chk_message);
			}
		});
		add(id_chk_btn);
		
		JLabel pw_label = new JLabel("Password : ");
		JPasswordField pw_field = new JPasswordField();
		Passwd_Check pwchk = new Passwd_Check();
		pw_field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				String pw_message = pwchk.pw_dupli_chk(pw_field.getText());
				System.out.println(pw_field.getText());
				message.setText(pw_message);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JLabel pw_chk_label = new JLabel("Pw Check : ");
		JPasswordField pw_chk_field = new JPasswordField();
		pw_chk_field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				String pw_message = pwchk.pw_double_chk(pw_chk_field.getText());
				message.setText(pw_message);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pw_label.setBounds(20, 50, 80, 30);
		pw_field.setBounds(100,50, 200, 30);
		pw_chk_label.setBounds(20, 90, 80, 30);
		pw_chk_field.setBounds(100,90, 200, 30);
		add(pw_label);
		add(pw_field);
		
		add(pw_chk_label);
		add(pw_chk_field);
		
		JLabel name_label = new JLabel("이름 :");
		JTextField name_field = new JTextField();
		
		name_label.setBounds(50, 130, 50, 30);
		name_field.setBounds(100,130, 200, 30);
		
		add(name_label);
		add(name_field);
		JLabel tmp_jumin = new JLabel();
		JLabel jumin_label = new JLabel("주민번호 :");
		JTextField jumin_field = new JTextField();
		jumin_field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				String str_j = jumin_field.getText();
				char[] ch = new char[str_j.length()];
				
			    for(int i=0; i<ch.length; i++) {
			      ch[i] = str_j.charAt(i); //String -> char
			
			    }
			    char[] copy = new char[ch.length];
			    String replc = "";
			    for(int i=0; i<copy.length; i++) {
			    	
			      if(i<=7) {
			        copy[i] = ch[i]; 
			      }else {
			        copy[i] = 'x'; 
			      }
			      replc += copy[i];
			    }
			    jumin_field.setText(replc);
			    
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		jumin_label.setBounds(30, 170, 70, 30);
		jumin_field.setBounds(100,170, 200, 30);
		add(jumin_label);
		add(jumin_field);
		
		JLabel email_label = new JLabel("e-mail :");
		JTextField email_field = new JTextField();

		email_label.setBounds(40, 210, 70, 30);
		email_field.setBounds(100,210, 200, 30);
		add(email_label);
		add(email_field);
		
		JButton insert = new JButton("회원가입");
		insert.setBounds(70, 300, 100, 50);
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = id_field.getText();
				String pw = pw_field.getText();
				String name = name_field.getText();
				boolean namecheck = Pattern.matches("[a-z]{3,10}", name);
				String jumin = jumin_field.getText();
				boolean jumincheck = Pattern.matches("\\d{6}-\\w{7}", jumin);
				String email = email_field.getText();
				boolean emailcheck = Pattern.matches("\\w{3,15}[@]\\w{3,10}.\\w{2,4}([.]\\w{2,4})?", email);
				
				if(!namecheck) {
					message.setText("이름은 모두 소문자입니다.");
				}else if(!jumincheck) {
					message.setText("주민번호 : 앞6자리 뒤 7자리 숫자입니다.");
				}else if(!emailcheck) {
					message.setText("이메일 형식에 맞지 않습니다.");
				}else {
					dao.user_info_insert(id, pw, name, jumin, email);
				}
			}
		});
		JButton close_btn = new JButton("취소");
		close_btn.setBounds(200, 300, 100, 50);
		close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 dispose();
			}
		});

		add(insert);
		add(close_btn);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S07_Register();
	}
}
