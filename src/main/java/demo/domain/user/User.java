package demo.domain.user;

import javax.persistence.*;

@Entity
public class User implements java.io.Serializable{

	private static final long serialVersionUID = 6436625643526650557L;

	@GeneratedValue
	@Id
	private Long id;
	
	private String login;
	
	public User() {}
	
	public User(String login_) {
		super();
		this.setLogin(login_);
	}

	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
