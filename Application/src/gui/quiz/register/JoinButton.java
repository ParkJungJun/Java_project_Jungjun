package gui.quiz.register;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JoinButton extends JButton{
//	public JoinButton(RegisterFrame parent) {
//		setText("가입하기");
//		addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//각 항복들이 전부 유효한지 체크해야 한다
//				if(!parent.idField.isValid()) {
//					// 알림창 띄우기 메서드
//					JOptionPane.showMessageDialog(parent //부모컨테이너(어느 컨테이너에 알림창을 띄울것인지)
//							, "ID값이 유효하지 않음" // 원하는 메시지
//							,"Error" // 제목
//							,JOptionPane.ERROR_MESSAGE); // 타입 (그림이 바뀜)
//					parent.idField.requestFocus();
//					return ;
//				}else if(!parent.duplIdBtn.isValid()) {
//					JOptionPane.showMessageDialog(parent,"ID중복체크를 진행하지 않음","Error",
//							JOptionPane.ERROR_MESSAGE);
//					parent.idField.requestFocus();
//					return;
//				}
//				
////				dao.insertNewMember(parent.idField.getText(),
////						new String parent.pwField.getPassword());
//			}
//		});
//	}
}
