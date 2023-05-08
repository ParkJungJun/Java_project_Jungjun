package gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class J06_JTextArea extends JFrame{
	//여러 줄의 텍스트를 입력할 수 있는 컴포넌트
	public J06_JTextArea() {
		JTextArea ta = new JTextArea("Hello, world!");
		ta.setBounds(10,10, 400, 400);
		
		// 자동 줄 바꿈 설정(wrap)
		ta.setLineWrap(true);
		
		// 테투리 설정 (BorderFactory 클래스의 스태틱 메서드들로 제작가능)
		ta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		//수정 가능 여부 설정
		ta.setEditable(false);
		
		//addKeyListener() : 키보드 관련 Event 설정
		ta.addKeyListener(new KeyListener() {
			// 문자가 입력(새로운 문자가 생기는 키)
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("key typed"+ e.getWhen());
				
			}
			//키보드가 눌렸을때 (새로운 )
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key pressed");
				
			}
			// 키보드에서 손을 뗄때 발생 이벤트
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("key released");
				
				// 이벤트 발생시 해당 키보드의 문자를 가져온다.
				System.out.println("keyChar : "+ e.getKeyChar());
				
				// 이벤트 발생시 해당 키보드의 번호를 가져온다.
				System.out.println("keyCode : "+ e.getKeyCode());
				
				// 왼쪽과 오른쪽에 모두 있는 키를 구분하기 위한 메서드
				// 일반 키보드 1번, 왼쪽에 있는거면 2번
				// 오른쪽 shift는 3번 , numpad 4번
				System.out.println("key : "+ e.getKeyLocation());
				System.out.println(KeyEvent.KEY_LOCATION_NUMPAD);
				System.out.println(KeyEvent.KEY_LOCATION_LEFT);
				
				// 이벤트를 발생시킨 컴포넌트 인스턴스를 반환
				System.out.println(""+ e.getComponent());
			}
			
		});
		
		add(ta);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new J06_JTextArea();
	}
}
