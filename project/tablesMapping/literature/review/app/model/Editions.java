package literature.review.app.model;
// Generated Dec 20, 2019, 7:40:21 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Editions generated by hbm2java
 */
@Entity
@Table(name = "editions", schema = "slr")
public class Editions implements java.io.Serializable {

	private long id;
	private Conferences conferences;
	private Publishers publishers;
	private String editors;
	private Integer year;
	private String number;
	private Date createdAt;
	private Set<ConferecePapers> conferecePaperses = new HashSet<ConferecePapers>(0);
	private Set<ConfereceEditorials> confereceEditorialses = new HashSet<ConfereceEditorials>(0);

	public Editions() {
	}

	public Editions(long id) {
		this.id = id;
	}

	public Editions(long id, Conferences conferences, Publishers publishers, String editors, Integer year,
			String number, Date createdAt, Set<ConferecePapers> conferecePaperses,
			Set<ConfereceEditorials> confereceEditorialses) {
		this.id = id;
		this.conferences = conferences;
		this.publishers = publishers;
		this.editors = editors;
		this.year = year;
		this.number = number;
		this.createdAt = createdAt;
		this.conferecePaperses = conferecePaperses;
		this.confereceEditorialses = confereceEditorialses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "conference_id")
	public Conferences getConferences() {
		return this.conferences;
	}

	public void setConferences(Conferences conferences) {
		this.conferences = conferences;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_id")
	public Publishers getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}

	@Column(name = "editors")
	public String getEditors() {
		return this.editors;
	}

	public void setEditors(String editors) {
		this.editors = editors;
	}

	@Column(name = "year")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Column(name = "number", length = 100)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", length = 13)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<ConferecePapers> getConferecePaperses() {
		return this.conferecePaperses;
	}

	public void setConferecePaperses(Set<ConferecePapers> conferecePaperses) {
		this.conferecePaperses = conferecePaperses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editions")
	public Set<ConfereceEditorials> getConfereceEditorialses() {
		return this.confereceEditorialses;
	}

	public void setConfereceEditorialses(Set<ConfereceEditorials> confereceEditorialses) {
		this.confereceEditorialses = confereceEditorialses;
	}

}