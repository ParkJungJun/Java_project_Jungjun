package swing.login_join_page;

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
public class JoinDAO {
	
	OjdbcConnectionPool cp = StaticResources.cp;
	
	public boolean join_chk() {
		UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
		UIManager.put("OptionPane.messageFont",
				new Font("HY헤드라인M", Font.BOLD, 50));
		String query =
				"INSERT INTO user_info "
				+ "(id,password,name,phone_number,birthday,email,preferential_treatment,usernum_pk)"
				+ " VALUES(?,?,?,?,?,?,?,'USER'||trim(TO_CHAR(USERNUM_PK.nextval,'000000')))";
		try (
				OjdbcSession session = cp.getSession();	
			) {
			Connection conn = session.getConnection();
			
		
			try( PreparedStatement pstmt = conn.prepareStatement(query);
				){
					if(Test3.pw_chk_B && Test3.email_chk_B &&
								Test3.num_chk_B && Test3.birthday_chk_B
								&& Test3.preferential_treatment_chk_B) {
						pstmt.setString(1, Test3.id2);
						pstmt.setString(2, Test3.pw2);
						pstmt.setString(3, Test3.name);
						pstmt.setString(4, Test3.phone_number);
						pstmt.setString(5, Test3.birthday);
						pstmt.setString(6, Test3.email);
						pstmt.setString(7, Test3.preferential_treatment);
						try(ResultSet rs = pstmt.executeQuery();){
							if(rs.next()) {
								JOptionPane.showMessageDialog(null,"회원가입 성공");
								Choice c = new Choice();
								c.setVisible(true);
								return true;
							}else {
								JOptionPane.showMessageDialog
								(null,"회원가입 실패입니다");
								return false;
							}
						}
					}
					JOptionPane.showMessageDialog(null,"정확한 값을 입력하세요");
					return false;
					
					
			} catch (SQLException e) {
				JOptionPane.showMessageDialog
				(null,"회원가입 실패(중복된 아이디가 있을 수 있습니다)_1");
				e.printStackTrace();
				return false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog
				(null,"회원가입 실패(중복된 아이디가 있을 수 있습니다)_2");
				e.printStackTrace();
				return false;
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog
			(null,"회원가입 실패(중복된 아이디가 있을 수 있습니다)_3");
			e.printStackTrace();
			return false;
		}
	}
}
