package app.configuration.db.tables;
// Generated Sep 27, 2019, 11:41:57 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Publication generated by hbm2java
 */
@Entity
@Table(name = "publication")
public class Publication implements java.io.Serializable {

	private int id;
	private String title;
	private String publicationType;
	private String abstract_;
	private String doi;
	private Integer year;
	private Date createdAt;
	private String keyDblp;
	private Set<AuthorPublications> authorPublicationses = new HashSet<AuthorPublications>(0);
	private Set<PublicationKeywords> publicationKeywordses = new HashSet<PublicationKeywords>(0);

	public Publication() {
	}

	public Publication(int id) {
		this.id = id;
	}
	
	public Publication(String title, String publicationType, String abstract_, String doi, Integer year, Date createdAt,
			String keyDblp) {
		
		this.title = title;
		this.publicationType = publicationType;
		this.abstract_ = abstract_;
		this.doi = doi;
		this.year = year;
		this.createdAt = createdAt;
		this.keyDblp = keyDblp;
	}

	public Publication(int id, String title, String publicationType, String abstract_, String doi, Integer year,
			Date createdAt, String keyDblp, Set<AuthorPublications> authorPublicationses,
			Set<PublicationKeywords> publicationKeywordses) {
		this.id = id;
		this.title = title;
		this.publicationType = publicationType;
		this.abstract_ = abstract_;
		this.doi = doi;
		this.year = year;
		this.createdAt = createdAt;
		this.keyDblp = keyDblp;
		this.authorPublicationses = authorPublicationses;
		this.publicationKeywordses = publicationKeywordses;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "publication_type", length = 100)
	public String getPublicationType() {
		return this.publicationType;
	}

	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
	}

	@Column(name = "abstract")
	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	@Column(name = "doi", length = 100)
	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	@Column(name = "year")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "key_dblp", length = 100)
	public String getKeyDblp() {
		return this.keyDblp;
	}

	public void setKeyDblp(String keyDblp) {
		this.keyDblp = keyDblp;
	}

	@OneToMany(orphanRemoval=true, cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "publication")
	public Set<PublicationKeywords> getPublicationKeywordses() {
		return this.publicationKeywordses;
	}
	
	@OneToMany(orphanRemoval=true, cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "publication")
	public Set<AuthorPublications> getAuthorPublicationses() {
		return this.authorPublicationses;
	}

	public void setAuthorPublicationses(Set<AuthorPublications> authorPublicationses) {
		this.authorPublicationses = authorPublicationses;
	}

	

	public void setPublicationKeywordses(Set<PublicationKeywords> publicationKeywordses) {
		this.publicationKeywordses = publicationKeywordses;
	}

}