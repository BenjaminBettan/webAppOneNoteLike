package demo.domain.page;

import javax.persistence.*;

@Entity
public class Page implements java.io.Serializable{

	private static final long serialVersionUID = 6436625643526650557L;

	@GeneratedValue
	@Id
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String contenuPage;
	
	private String nomPage;
	
	public Page() {}
	
	public Page(String nomPage_) {
		super();
		setNomPage(nomPage_);
	}

	public Long getId() {
		return id;
	}

	public String getContenuPage() {
		return contenuPage;
	}

	public void setContenuPage(String pageContent) {
		this.contenuPage = pageContent;
	}

	public String getNomPage() {
		return nomPage;
	}

	public void setNomPage(String nomPage) {
		this.nomPage = nomPage;
	}

}
