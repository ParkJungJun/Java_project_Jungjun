package gui.quiz.register;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PwChkField extends JPasswordField{
	
	public PwChkField(PwField pwField, JLabel stateLable) {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!pwField.getValid()) {
					stateLable.setForeground(Color.RED);
					stateLable.setText("불일치");
				}
				
				if(Arrays.equals(pwField.getPassword(), getPassword())){
					stateLable.setForeground(new Color(0x1d6309));
					stateLable.setText("일치");
				}else {
					stateLable.setForeground(Color.RED);
					stateLable.setText("불일치");
				}
				
			}
		});
	}
	
}
