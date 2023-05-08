package gui.quiz;

public class Member_Join_DTO {
	private String user_id;
	private String user_pw;
	private String user_name;
	private Integer jumin;
	private String email;
	
	public Member_Join_DTO(String user_id, String user_pw, String user_name, Integer jumin, String email) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.jumin = jumin;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public Integer getJumin() {
		return jumin;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setJumin(Integer jumin) {
		this.jumin = jumin;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
}
