package swing;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Admin_pageDAO {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Connection conn = getConnection();
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "hr","1234");
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean login_chk() {
		UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
		UIManager.put("OptionPane.messageFont",
				new Font("굴림", Font.BOLD, 50));
		String query ="SELECT id,password FROM user_info WHERE id =? AND password=?";
		try( PreparedStatement pstmt = conn.prepareStatement(query);
			){
				pstmt.setString(1, Admin_page.id);
				pstmt.setString(2, Admin_page.pw);
				
				try(ResultSet rs = pstmt.executeQuery();){
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"로그인에 성공했습니다");
						Choice c = new Choice();
						c.setVisible(true);
						return true;
					}else {
						JOptionPane.showMessageDialog(null,"로그인에 실패했습니다");
						return false;
					}
				}catch(Exception e) {
					e.printStackTrace();
					return false;
				}
	
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
