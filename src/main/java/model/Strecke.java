package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
@Entity
public class Strecke {

	public Strecke(Bahnhof start, Bahnhof bahnhof, Bahnhof ende) {
		super();
		this.start = start;
		this.bahnhof = bahnhof;
		this.ende = ende;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long ID;

	private Bahnhof start;

	private Bahnhof bahnhof;

	private Bahnhof ende;


	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public Bahnhof getStart() {
		return start;
	}

	public void setStart(Bahnhof start) {
		this.start = start;
	}

	public Bahnhof getBahnhof() {
		return bahnhof;
	}

	public void setBahnhof(Bahnhof bahnhof) {
		this.bahnhof = bahnhof;
	}

	public Bahnhof getEnde() {
		return ende;
	}

	public void setEnde(Bahnhof ende) {
		this.ende = ende;
	}
}
