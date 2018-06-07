package model;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
@Entity
@NamedQueries ({@NamedQuery(name="Reservierung.getAll",query="SELECT b from Bahnhof b")})
public class Reservierung {


	public Reservierung(Date datum, int praemienMeilenBonus, int preis, StatusInfo status, Zug zug, Strecke strecke, Benutzer benutzer, Zahlung zahlung) {
		super();
		this.datum = datum;
		this.praemienMeilenBonus = praemienMeilenBonus;
		this.preis = preis;
		this.status = status;
		this.zug = zug;
		this.strecke = strecke;
		this.benutzer = benutzer;
		this.zahlung = zahlung;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long ID;

	private Date datum;

	private int praemienMeilenBonus = 15;

	private int preis = 150;

	private StatusInfo status;

	private Zug zug;

	private Strecke strecke;

	private Benutzer benutzer;

	private Zahlung zahlung;

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public int getPraemienMeilenBonus() {
		return praemienMeilenBonus;
	}

	public void setPraemienMeilenBonus(int praemienMeilenBonus) {
		this.praemienMeilenBonus = praemienMeilenBonus;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public StatusInfo getStatus() {
		return status;
	}

	public void setStatus(StatusInfo status) {
		this.status = status;
	}

	public Zug getZug() {
		return zug;
	}

	public void setZug(Zug zug) {
		this.zug = zug;
	}

	public Strecke getStrecke() {
		return strecke;
	}

	public void setStrecke(Strecke strecke) {
		this.strecke = strecke;
	}

	public Benutzer getBenutzer() {
		return benutzer;
	}

	public void setBenutzer(Benutzer benutzer) {
		this.benutzer = benutzer;
	}

	public Zahlung getZahlung() {
		return zahlung;
	}

	public void setZahlung(Zahlung zahlung) {
		this.zahlung = zahlung;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Reservierung that = (Reservierung) o;

		if (getPraemienMeilenBonus() != that.getPraemienMeilenBonus()) return false;
		if (getPreis() != that.getPreis()) return false;
		if (getID() != null ? !getID().equals(that.getID()) : that.getID() != null) return false;
		if (getDatum() != null ? !getDatum().equals(that.getDatum()) : that.getDatum() != null) return false;
		if (getStatus() != that.getStatus()) return false;
		if (getZug() != null ? !getZug().equals(that.getZug()) : that.getZug() != null) return false;
		if (getStrecke() != null ? !getStrecke().equals(that.getStrecke()) : that.getStrecke() != null) return false;
		if (getBenutzer() != null ? !getBenutzer().equals(that.getBenutzer()) : that.getBenutzer() != null)
			return false;
		return getZahlung() != null ? getZahlung().equals(that.getZahlung()) : that.getZahlung() == null;
	}

	@Override
	public int hashCode() {
		int result = getID() != null ? getID().hashCode() : 0;
		return result;
	}
}
