package app.configuration.db.tables;
// Generated Sep 27, 2019, 11:41:57 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PublicationKeywords generated by hbm2java
 */
@Entity
@Table(name = "publication_keywords")
public class PublicationKeywords implements java.io.Serializable {

	private int id;
	private Keyword keyword;
	private Publication publication;

	public PublicationKeywords() {
	}

	public PublicationKeywords(int id) {
		this.id = id;
	}

	public PublicationKeywords(int id, Keyword keyword, Publication publication) {
		this.id = id;
		this.keyword = keyword;
		this.publication = publication;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "keyword_id")
	public Keyword getKeyword() {
		return this.keyword;
	}

	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}

	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "publication_id")
	public Publication getPublication() {
		return this.publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
