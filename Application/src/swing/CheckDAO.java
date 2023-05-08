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
// 사용
public class CheckDAO {
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
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr","1234");
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void id_check() {
		UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
		UIManager.put("OptionPane.messageFont",
				new Font("굴림", Font.BOLD, 50));
		String query = "SELECT * FROM user_info WHERE id = ?";
		
		try( PreparedStatement pstmt = conn.prepareStatement(query);
				){
			pstmt.setString(1,Test3.id2);
			
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"이미 존재하는 아이디입니다");
					Choice c = new Choice();
					c.setVisible(true);
				}else if(!(rs.next()) && Test3.id2.equals("")){
					JOptionPane.showMessageDialog(null,"아이디를 입력하세요");
				}else {
					JOptionPane.showMessageDialog(null,"사용가능한 아이디입니다");
				}
			}catch(Exception e) {
					e.printStackTrace();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
