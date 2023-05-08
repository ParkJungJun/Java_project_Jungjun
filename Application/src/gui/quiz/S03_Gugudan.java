package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class S03_Gugudan {
	/*
	 *  # 실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
	 *  
	 *  (1) 프로그램을 처음 실행하면 구구단 2단이 출력되어 있는 상태로 시작
	 *  
	 *  (2) + 버튼을 누르면 단이 증가하며 구구단 내용이 바뀜 (최대 9단까지)
	 *  
	 *  (3) - 버튼을 누르면 단이 감소하며 구구단 내용이 바뀜 (최소 2단까지)
	 */
	private static int n = 2;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//int n = 2;
		JButton button1 = new JButton("+");
		JButton button2 = new JButton("-");
		JButton button_1 = new JButton(n + "x1 = " + n*1);
		JButton button_2 = new JButton(n + "x2 = " + n*2);
		JButton button_3 = new JButton(n + "x3 = " + n*3);
		JButton button_4 = new JButton(n + "x4 = " + n*4);
		JButton button_5 = new JButton(n + "x5 = " + n*5);
		JButton button_6 = new JButton(n + "x6 = " + n*6);
		JButton button_7 = new JButton(n + "x7 = " + n*7);
		JButton button_8 = new JButton(n + "x8 = " + n*8);
		JButton button_9 = new JButton(n + "x9 = " + n*9);
		
		
		
		
		button1.setLocation(10,10);
		button2.setLocation(10,300);
		button_1.setLocation(500,10);
		button_2.setLocation(500,120);
		button_3.setLocation(500,230);
		button_4.setLocation(500,340);
		button_5.setLocation(500,450);
		button_6.setLocation(500,560);
		button_7.setLocation(500,670);
		button_8.setLocation(500,780);
		button_9.setLocation(610,780);
		
		button1.setSize(100,100);
		button2.setSize(100,100);
		button_1.setSize(100,100);
		button_2.setSize(100,100);
		button_3.setSize(100,100);
		button_4.setSize(100,100);
		button_5.setSize(100,100);
		button_6.setSize(100,100);
		button_7.setSize(100,100);
		button_8.setSize(100,100);
		button_9.setSize(100,100);
		
		Font font1 = new Font("Ravie",Font.BOLD,50);
		
		button1.setFont(font1);
		button2.setFont(font1);
//		button_1.setFont(font1);
//		button_2.setFont(font1);
//		button_3.setFont(font1);
//		button_4.setFont(font1);
//		button_5.setFont(font1);
//		button_6.setFont(font1);
//		button_7.setFont(font1);
//		button_8.setFont(font1);
//		button_9.setFont(font1);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button_1);
		frame.add(button_2);
		frame.add(button_3);
		frame.add(button_4);
		frame.add(button_5);
		frame.add(button_6);
		frame.add(button_7);
		frame.add(button_8);
		frame.add(button_9);
		
		frame.setLayout(null);
		
		
		button1.addActionListener(new ActionListener() {
			//int n = 2;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼을 누르셨습니다");
				if(n >= 9){
					
				}else {
					n++;	
				}
				
				button_1.setText(n + "x1 = " + n*1);
				button_2.setText(n + "x2 = " + n*2);
				button_3.setText(n + "x3 = " + n*3);
				button_4.setText(n + "x4 = " + n*4);
				button_5.setText(n + "x5 = " + n*5);
				button_6.setText(n + "x6 = " + n*6);
				button_7.setText(n + "x7 = " + n*7);
				button_8.setText(n + "x8 = " + n*8);
				button_9.setText(n + "x9 = " + n*9);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			//int n = 2;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스 버튼을 누르셨습니다");
				if(n <= 2){
					
				}else {
					n--;	
				}
				button_1.setText(n + "x1 = " + n*1);
				button_2.setText(n + "x2 = " + n*2);
				button_3.setText(n + "x3 = " + n*3);
				button_4.setText(n + "x4 = " + n*4);
				button_5.setText(n + "x5 = " + n*5);
				button_6.setText(n + "x6 = " + n*6);
				button_7.setText(n + "x7 = " + n*7);
				button_8.setText(n + "x8 = " + n*8);
				button_9.setText(n + "x9 = " + n*9);
			}
		});
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.setLocation(300,100);
		
		frame.setSize(1000,1000);
		
		frame.setVisible(true);
	}
}
