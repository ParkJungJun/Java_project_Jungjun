package gui;

import javax.swing.JButton;

public class GugudanButton extends JButton{
	int dan = 2;
	int gop;
	
	public GugudanButton(int gop) {
		this.gop = gop;
		setSize(200, 50);
		setLocation(50,50 + 80*(gop-1));
	}
	public void setGop(int gop) {
		this.gop = gop;
		update();
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		if(dan>9 || dan<2) {
			return;
		}
		
		this.dan = dan;
		update();
	}
	
	private void update() {
		setText(String.format("%d x %d = %d", dan,gop, dan * gop));
	}
	
}
