package gui.quiz.gugudan;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class GugudanFrame extends JFrame{
	
	List<GugudanButton> gugudans = new ArrayList<>();
	
	public GugudanFrame() {
		
		PlusButton plus = new PlusButton(this);
		MiusButton mius = new MiusButton(this);
		for(int gop = 1; gop <= 9; ++gop) {
			GugudanButton btn = new GugudanButton(gop);
			add(btn);
			gugudans.add(btn);
		}
		
		add(plus);
		add(mius);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gugudan Frame!!");
		setLayout(null);
		setLocation(100,100);
		setSize(600,700);
		setVisible(true);
	}
}
