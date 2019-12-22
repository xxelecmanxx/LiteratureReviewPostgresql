package literature.review.app.model;
// Generated Dec 20, 2019, 7:40:21 PM by Hibernate Tools 5.2.12.Final

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * VolumeNumbers generated by hbm2java
 */
@Entity
@Table(name = "volume_numbers", schema = "slr")
@JsonIgnoreProperties({"hibernateLazyinitializer","handler"})
public class VolumeNumbers implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "journal_id")
	@JsonIgnore
	private Journals journals;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_id")
	private Publishers publishers;
	
	
	private Integer volume;
	private Integer number;
	private String pages;
	private Date createdAt;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "volumeNumbers", cascade = CascadeType.ALL)
	private Set<JournalPapers> journalPaperses = new HashSet<JournalPapers>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "volumeNumbers", cascade = CascadeType.ALL)
	private Set<JournalEditorials> journalEditorialses = new HashSet<JournalEditorials>(0);

	public VolumeNumbers() {
	}

	public VolumeNumbers(long id) {
		this.id = id;
	}

	public VolumeNumbers(long id, Journals journals, Publishers publishers, Integer volume, Integer number,
			String pages, Date createdAt, Set<JournalPapers> journalPaperses,
			Set<JournalEditorials> journalEditorialses) {
		this.id = id;
		this.journals = journals;
		this.publishers = publishers;
		this.volume = volume;
		this.number = number;
		this.pages = pages;
		this.createdAt = createdAt;
		this.journalPaperses = journalPaperses;
		this.journalEditorialses = journalEditorialses;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public Journals getJournals() {
		return this.journals;
	}

	public void setJournals(Journals journals) {
		this.journals = journals;
	}


	public Publishers getPublishers() {
		return this.publishers;
	}

	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}

	@Column(name = "volume")
	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@Column(name = "number")
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "pages")
	public String getPages() {
		return this.pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_at", length = 13)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	public Set<JournalPapers> getJournalPaperses() {
		return this.journalPaperses;
	}

	public void setJournalPaperses(Set<JournalPapers> journalPaperses) {
		this.journalPaperses = journalPaperses;
	}

	public Set<JournalEditorials> getJournalEditorialses() {
		return this.journalEditorialses;
	}

	public void setJournalEditorialses(Set<JournalEditorials> journalEditorialses) {
		this.journalEditorialses = journalEditorialses;
	}

}