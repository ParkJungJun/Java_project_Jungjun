package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S12_JPanel {
	/*
	 * # JPanel
	 * 
	 * - 컨테이너 역할을 하는 컴포넌트
	 * - 레이아웃 위에 또 다른 레이아웃을 설정할 수 있다
	 */
	public static void main(String[] args) {
		
		JFrame mainframe = new JFrame("JPanel Test");
		
		GridLayout grid = new GridLayout(2,2);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		//JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		
		// JPanel은 컴포넌트이기 때문에 프레임 위에 붙일 수 있고
		// 컨테인 역할을 하기 때문에 레이아웃을 설정할 수 있다
		JPanel p2 = new JPanel();
		
		p2.setLayout(new GridLayout(5,5));
		for(int i = 0; i < 25; ++i) {
			p2.add(new JButton(String.format("2-%d", i)));
		}
		
		JPanel p3 = new JPanel();
		
		p3.setLayout(new BorderLayout());
		
		p3.add(new JButton("3-North"), BorderLayout.NORTH);
		p3.add(new JButton("3-South"), BorderLayout.SOUTH);
		p3.add(new JButton("3-East"), BorderLayout.EAST);
		p3.add(new JButton("3-West"), BorderLayout.WEST);
		p3.add(new JButton("3-Center"), BorderLayout.CENTER);
		
		mainframe.add(b1);
		mainframe.add(p2);
		mainframe.add(p3);
		mainframe.add(b4);
		
		mainframe.setLayout(grid);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setBounds(100,100,500,500);
		mainframe.setVisible(true);
	}
}
