package gui;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_Image {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Image...");
		
		JLabel image1 = new JLabel();
		JLabel image2 = new JLabel();
		JLabel image3 = new JLabel();
		JLabel image4 = new JLabel();
		
		//image1.setIcon(new ImageIcon("files/images/살라.jpg"));
		//image2.setIcon(new ImageIcon("files/images/손흥민.jpg"));
		
		try {
			//이미지 로딩
			BufferedImage bufferedImage = 
					ImageIO.read(new File("files/images/살라.jpg"));
			BufferedImage bufferedImage2 = 
					ImageIO.read(new File("files/images/손흥민.jpg"));
			// getScaledInstance() : 크기 조절된 이미지 인스턴스를 반환
			Image scaledImage = 
					bufferedImage.getScaledInstance(250, 250, Image.SCALE_AREA_AVERAGING);
			Image scaledImage2 = 
					bufferedImage2.getScaledInstance(250, 250, Image.SCALE_AREA_AVERAGING);
			// getSubimage() : 원본에서 원하는 원하는 일부 이미지를 잘라서 반환
			Image subImage = bufferedImage.getSubimage(150, 200, 100, 100);
			Image subImage2 = bufferedImage2.getSubimage(150, 200, 100, 100);
			
			image1.setIcon(new ImageIcon(subImage));
			image2.setIcon(new ImageIcon(scaledImage));
			
			image3.setIcon(new ImageIcon(subImage2));
			image4.setIcon(new ImageIcon(scaledImage2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		f.add(image1);
		f.add(image2);
		f.add(image3);
		f.add(image4);
		
		f.setLayout(new GridLayout(2,2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,500,500);
		f.setVisible(true);
	}
}
