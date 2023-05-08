package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton("Main Button");
	JButton subBtn = new JButton("sub Button");
	public S03_JButton(){
		super("JButton Test 입니다");
		
		setLayout(new BorderLayout());
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.SOUTH);
		
		// 버튼 텍스트 바꾸기
		mainBtn.setText("안녕하세요!");
		
		// 버튼 글꼴 바꾸기 (windows/font에 있는 모든 글꼴 사용 가능)
		// 스타일 옵션은 | 연산으로 복수 적용 가능
		mainBtn.setFont(new Font("돋음",Font.PLAIN, 50));
		
		// 버튼 색 변경 (색상에는 RGB 사용)
		mainBtn.setBackground(Color.white);
		//mainBtn.setForeground(Color.ORANGE);
		//mainBtn.setForeground(new Color(78, 196, 51));// RGB값
		mainBtn.setForeground(new Color(0x4ec433)); // 16진수 HEX값
		
		// 버튼의 이벤트 동작 설정
		mainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메인 버튼을 누르셨습니다!");
				
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S03_JButton();
	}
}
