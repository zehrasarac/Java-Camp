package kodlamaio;

public class User {
	private int userId;
	private String email;
	private String password;
	
	public User() {
		
	}

	public User(int id, String email, String password) {
		this.userId = id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
