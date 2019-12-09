package demo.domain.onglet;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import demo.domain.page.Page;
import demo.domain.user.User;

@Entity
public class Onglet implements java.io.Serializable{

	private static final long serialVersionUID = -8081972089907358737L;

	@GeneratedValue
	@Id
	private Long id;
	
	private List<Page> listePages;
	private User user;
	
	public Onglet() {}
	
	public Onglet(List<Page> l, User user_) {
		super();
		setListePages(l);
		setUser(user_);
	}

	public Long getId() {
		return id;
	}

	@ElementCollection
	public List<Page> getListePages() {
		return listePages;
	}

	public void setListePages(List<Page> listePages) {
		this.listePages = listePages;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
