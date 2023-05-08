package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class GugudanFrame extends JFrame{
	List<GugudanButton> gugudans = new ArrayList<>();
	
	PlusButton plus = new PlusButton(this);
	MinusButton minus = new MinusButton(this);
	
	public GugudanFrame() {
		for(int gop = 1; gop <= 9; ++gop) {
			
			GugudanButton btn = new GugudanButton(gop);
			add(btn);
			gugudans.add(btn);
		}
		BorderLayout layout = new BorderLayout();
		
		add(plus);
		add(minus);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gugudan Frame");
		setLayout(layout);
		setLocation(100,100);
		setSize(600, 800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GugudanFrame();
	}
}
