package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.JList;

public class unknown {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					unknown window = new unknown();
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
	public unknown() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		action.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 503);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel test = new JPanel();
		test.setPreferredSize(new Dimension( 2000,2000));
		JScrollPane scrollFrame = new JScrollPane(test);
		test.setAutoscrolls(true);
		scrollFrame.setPreferredSize(new Dimension( 800,300));
		
		
		//1번 화면
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "화면_1");
		panel_1.setLayout(null);
		
		//1번 화면_다음페이지버튼
		JButton p1_next_btn = new JButton("다음페이지");
		p1_next_btn.setBounds(570, 387, 97, 23);
		panel_1.add(p1_next_btn);
		
		JLabel lblNewLabel_2 = new JLabel("화면1");
		lblNewLabel_2.setBounds(90, 57, 57, 15);
		panel_1.add(lblNewLabel_2);
		
		//텍스트필드액션
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
				cardLayout.show(frame.getContentPane(), "화면_2");
			}
			
		});
		
		textField.setBounds(44, 147, 116, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 104, 116, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("서울");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText("서울");
			}
		});
		btnNewButton.setBounds(266, 103, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("부산");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("부산");
			}
		});
		btnNewButton_1.setBounds(266, 146, 97, 23);
		panel_1.add(btnNewButton_1);
		
		
		//1번 화면_다음페이지버튼_액션
		p1_next_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                cardLayout.show(frame.getContentPane(), "화면_2");
            }
        });
		
		//2번 화면
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "화면_2");
		panel_2.setLayout(null);
		
		//2번 화면_이전페이지버튼
		JButton p2_back_btn = new JButton("이전페이지");
		p2_back_btn.setBounds(473, 387, 97, 23);
		panel_2.add(p2_back_btn);
		
		//2번 화면_이전페이지버튼_액션
		p2_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
				cardLayout.show(frame.getContentPane(), "화면_1");
			}
		});
		//2번 화면_다음페이지버튼
		JButton p2_next_btn = new JButton("다음페이지");
		p2_next_btn.setBounds(582, 387, 97, 23);
		panel_2.add(p2_next_btn);
		
		JLabel lblNewLabel_1 = new JLabel("화면2");
		lblNewLabel_1.setBounds(58, 74, 57, 15);
		panel_2.add(lblNewLabel_1);
		
		//2번 화면_다음페이지버튼_액션
		p2_next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
				cardLayout.show(frame.getContentPane(), "화면_3");
			}
		});
		
		//3번 화면
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "화면_3");
		panel_3.setLayout(null);
		
		//3번 화면_이전 페이지 버튼
		JButton p3_back_btn = new JButton("이전페이지");
		p3_back_btn.setBounds(570, 387, 97, 23);
		panel_3.add(p3_back_btn);
		
		JLabel lblNewLabel = new JLabel("화면3");
		lblNewLabel.setBounds(65, 24, 57, 15);
		panel_3.add(lblNewLabel);
		
		//3번 화면_이전 페이지 버튼 액션
		p3_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
				cardLayout.show(frame.getContentPane(), "화면_2");
			}
		});
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
