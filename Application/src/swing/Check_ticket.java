package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class Check_ticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_ticket window = new Check_ticket();
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
	public Check_ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(500, 100, 1000, 800);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JButton list_btn_1 = new JButton("목록");
		list_btn_1.setBounds(820, 20, 150, 100);
		list_btn_1.setFont(new Font("굴림", Font.PLAIN, 50));
		panel.add(list_btn_1);
		
		JLabel lblNewLabel = new JLabel("승차권 확인");
		lblNewLabel.setBounds(275, 50, 400, 100);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 70));
		panel.add(lblNewLabel);
		
		JLabel ticket_1_1 = new JLabel("승차권(1)");
		ticket_1_1.setBounds(130, 200, 300, 100);
		ticket_1_1.setFont(new Font("굴림", Font.PLAIN, 50));
		panel.add(ticket_1_1);
		
		JLabel pass_1 = new JLabel("정기권,패스");
		pass_1.setBounds(550, 200, 300, 100);
		pass_1.setFont(new Font("굴림", Font.PLAIN, 50));
		panel.add(pass_1);
		
		JLabel time_ticket_1_1 = new JLabel("06:00");
		time_ticket_1_1.setBounds(165, 300, 200, 100);
		time_ticket_1_1.setFont(new Font("굴림", Font.PLAIN, 50));
		panel.add(time_ticket_1_1);
		
		JLabel time_pass_1 = new JLabel("08:37");
		time_pass_1.setBounds(600, 300, 200, 100);
		time_pass_1.setFont(new Font("굴림", Font.PLAIN, 50));
		panel.add(time_pass_1);
		
		JLabel lblNewLabel_1 = new JLabel("KTX 105");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 50));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(130, 435, 250, 100);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("열차정보");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton.setBounds(600, 410, 250, 100);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("타는곳번호");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(165, 550, 171, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("15분전에\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(149, 594, 200, 100);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("표시됩니다");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(149, 653, 205, 91);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("호차번호");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(375, 545, 200, 34);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("4호차");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_6.setBounds(361, 622, 250, 72);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("좌석번호");
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(611, 550, 250, 34);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("4C");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_8.setBounds(670, 622, 150, 72);
		panel.add(lblNewLabel_8);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
