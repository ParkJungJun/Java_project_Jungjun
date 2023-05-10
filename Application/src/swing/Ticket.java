package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ticket {

	private JFrame frame;
	
	ImageIcon img1 = new ImageIcon
	("C:/java_PJJ/Java_project_Jungjun/Application/images/ticket_top_image.PNG");
	ImageIcon img4 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/E-RAIL.PNG");
	ImageIcon img6 = new ImageIcon
			("C:/java_PJJ/Java_project_Jungjun/Application/images/back.PNG");
	ImageIcon img7 = new ImageIcon
	("C:/java_PJJ/Java_project_Jungjun/Application/images/ticket_background.PNG");
	
	Image img = img4.getImage();
 	Image updateImg = img.getScaledInstance(100, 80, Image.SCALE_SMOOTH);
    ImageIcon updateIcon = new ImageIcon(updateImg);		
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JPanel ticket_panel = new JPanel();
		ticket_panel.setBounds(450, 263, 1000, 600);
		ticket_panel.setBorder(new LineBorder(Color.black,5));
		frame.getContentPane().add(ticket_panel);
		ticket_panel.setLayout(null);
		
		JLabel starting_point = new JLabel("영등포영등포");
		starting_point.setBackground(Color.WHITE);
		starting_point.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		starting_point.setBounds(50, 75, 250, 100);
		ticket_panel.add(starting_point);
		
		JLabel starting_time = new JLabel("11:59");
		starting_time.setHorizontalAlignment(SwingConstants.CENTER);
		starting_time.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		starting_time.setBounds(50, 175, 200, 75);
		ticket_panel.add(starting_time);
		
		JLabel arrow = new JLabel("▶");
		arrow.setFont(new Font("HY헤드라인M", Font.PLAIN, 70));
		arrow.setBounds(275, 75, 100, 100);
		ticket_panel.add(arrow);
		
		JLabel ending_point = new JLabel("조치원조치원");
		ending_point.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		ending_point.setBounds(350, 75, 250, 100);
		ticket_panel.add(ending_point);
		
		JLabel ending_time = new JLabel("12:59");
		ending_time.setHorizontalAlignment(SwingConstants.CENTER);
		ending_time.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		ending_time.setBounds(350, 175, 200, 75);
		ticket_panel.add(ending_time);
		
		JLabel train_info = new JLabel("ITX-새마을 1020");
		train_info.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		train_info.setBounds(50, 255, 300, 75);
		ticket_panel.add(train_info);
		
		JLabel train_num_image = new JLabel("호차번호");
		train_num_image.setBackground(Color.BLUE);
		train_num_image.setForeground(Color.DARK_GRAY);
		train_num_image.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		train_num_image.setHorizontalAlignment(SwingConstants.CENTER);
		train_num_image.setBounds(100, 375, 180, 74);
		train_num_image.setBorder(new LineBorder(Color.gray,1));
		ticket_panel.add(train_num_image);
		
		JLabel seat_num_image = new JLabel("좌석 번호");
		seat_num_image.setForeground(Color.DARK_GRAY);
		seat_num_image.setHorizontalAlignment(SwingConstants.CENTER);
		seat_num_image.setFont(new Font("HY헤드라인M", Font.PLAIN, 35));
		seat_num_image.setBounds(280, 375, 180, 74);
		seat_num_image.setBorder(new LineBorder(Color.gray,1));
		ticket_panel.add(seat_num_image);
		
		JLabel train_num = new JLabel("1호차");
		train_num.setBackground(Color.WHITE);
		train_num.setHorizontalAlignment(SwingConstants.CENTER);
		train_num.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		train_num.setBorder(new LineBorder(Color.gray,1));
		train_num.setBounds(100, 449, 180, 74);
		ticket_panel.add(train_num);
		
		JLabel seat_num = new JLabel("12D");
		seat_num.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		seat_num.setHorizontalAlignment(SwingConstants.CENTER);
		seat_num.setBorder(new LineBorder(Color.gray,1));
		seat_num.setBounds(280, 449, 180, 74);
		ticket_panel.add(seat_num);
		
		JLabel lblNewLabel = new JLabel("일반식/순방향/성인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		lblNewLabel.setBounds(310, 530, 150, 40);
		ticket_panel.add(lblNewLabel);
		
		JLabel train_food_image = new JLabel(" 차내식");
		train_food_image.setOpaque(true);
		train_food_image.setBackground(Color.LIGHT_GRAY);
		train_food_image.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		train_food_image.setBounds(650, 100, 250, 75);
		train_food_image.setBorder(new LineBorder(Color.gray,1));
		ticket_panel.add(train_food_image);
		
		JLabel train_food_1 = new JLabel(" 불고기덮밥");
		train_food_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		train_food_1.setBounds(650, 175, 200, 50);
		ticket_panel.add(train_food_1);
		
		JLabel train_food_2 = new JLabel(" 콜라");
		train_food_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		train_food_2.setBounds(650, 225, 200, 50);
		ticket_panel.add(train_food_2);
		
		JLabel food_1_count = new JLabel("1");
		food_1_count.setHorizontalAlignment(SwingConstants.CENTER);
		food_1_count.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		food_1_count.setBounds(850, 175, 50, 50);
		ticket_panel.add(food_1_count);
		
		JLabel food_2_count = new JLabel("1");
		food_2_count.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		food_2_count.setHorizontalAlignment(SwingConstants.CENTER);
		food_2_count.setBounds(850, 225, 50, 50);
		ticket_panel.add(food_2_count);
		
		JLabel E_RAIL_image = new JLabel(updateIcon);
		E_RAIL_image.setBounds(801, 425, 100, 80);
		ticket_panel.add(E_RAIL_image);
		
		JLabel ticket_num = new JLabel("승차권번호 12345-1234-1234-12");
		ticket_num.setHorizontalAlignment(SwingConstants.CENTER);
		ticket_num.setForeground(Color.GRAY);
		ticket_num.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		ticket_num.setBounds(630, 530, 327, 40);
		ticket_panel.add(ticket_num);
		
		JLabel ticket_date = new JLabel("승차일 2023년 5월 5일 (금)");
		ticket_date.setForeground(Color.WHITE);
		ticket_date.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		ticket_date.setBounds(465, 210, 460, 53);
		frame.getContentPane().add(ticket_date);
		
		JLabel ticket_top_image_blue = new JLabel(img1);
		ticket_top_image_blue.setBounds(450, 205, 1000, 59);
		frame.getContentPane().add(ticket_top_image_blue);
		
		JButton payment_btn = new JButton("결제");
		payment_btn.setForeground(Color.WHITE);
		payment_btn.setFont(new Font("HY헤드라인M", Font.PLAIN, 50));
		payment_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		train_food_image.setOpaque(true);
		
		JLabel background = new JLabel(img7);
		background.setBounds(100, 375, 360, 74);
		ticket_panel.add(background);
		payment_btn.setBackground(new Color(0, 128, 192));
		payment_btn.setBounds(1550, 900, 300, 100);
		frame.getContentPane().add(payment_btn);
		
		JButton back_btn = new JButton(img6);
		back_btn.setBounds(50, 50, 136, 136);
		back_btn.setBackground(Color.white);
		back_btn.setBorderPainted(false);
		back_btn.setContentAreaFilled(false);
		back_btn.setFocusPainted(false);
		frame.getContentPane().add(back_btn);
		
		
	}
}
