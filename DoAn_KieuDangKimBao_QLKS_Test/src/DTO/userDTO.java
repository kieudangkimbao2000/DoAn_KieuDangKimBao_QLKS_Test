package DTO;

public class userDTO {
	private String username;
	private String password;
	public userDTO(String name,String pass) {
		this.username=name;
		this.password=pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String usename) {
		this.username = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
