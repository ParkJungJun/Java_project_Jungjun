package gui.quiz.register;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.keyevent.ValidPwCheckKeyEvent;

public class PwField extends JPasswordField{
	
	
	
	private boolean valid;
	
	public PwField(JLabel stateLabel) {
		addKeyListener(new KeyAdapter() {
			
			final private static String SPECIAL_CHARS = "!@#$%^&*()_+\\|,.<>?/'\";`~";
			
			final private static String VALID_PASSWORD_CHARS = 
					"abcdefghijklmnopqrstuvwxyABCDEFGHIJKMNOPQRSTUVWXYZ" +
					"0123456789" + SPECIAL_CHARS;
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				char[] password = ((JPasswordField)e.getComponent()).getPassword();
				
				int len = password.length;
				
				boolean hasNumber = false;
				boolean hasLower = false;
				boolean hasUpper = false;
				boolean hasSpecal = false;
				
				for(int i = 0; i < len; ++i) {
					char ch = password[i];
					
					if(VALID_PASSWORD_CHARS.indexOf(ch) == -1) {
						stateLabel.setForeground(Color.RED);
						stateLabel.setText("허용되지 않은 문자가 포함되어 있습니다.");
						valid = false;
						return;
						
					}
					
					if(ch >= '0' && ch <= '9') {
						hasNumber = true;
					}else if(ch >= 'a' && ch <= 'z') {
						hasLower = true;
					}else if(ch >= 'A' && ch <= 'Z') {
						hasUpper = true;
					}else if(SPECIAL_CHARS.indexOf(ch) != -1) {
						hasSpecal = true;
					}
				}
				
				if(len > 6 && hasNumber && hasLower && hasUpper && hasSpecal) {
					stateLabel.setForeground(new Color(0x1d6309));
					stateLabel.setText("사용 가능한 비밀번호입니다.");
					valid = true;
				}else {
					stateLabel.setForeground(Color.RED);
					stateLabel.setText("사용 불가능한 비밀번호입니다.");
					valid = false;
				}
			}
		});
	}
	
	public boolean getValid() {
		return valid;
	}
}
