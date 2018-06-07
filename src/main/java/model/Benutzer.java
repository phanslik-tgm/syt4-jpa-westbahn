package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
import java.util.Collection;

@Entity
public class Benutzer {

	public Benutzer(String vorName, String nachName, String eMail, String passwort, String smsNummer, Long verbuchtePraemienMeilen)
	{
		super();
		this.vorName = vorName;
		this.nachName = nachName;
		this.eMail = eMail;
		this.passwort = passwort;
		this.smsNummer = smsNummer;
		this.verbuchtePraemienMeilen = verbuchtePraemienMeilen;
	}


	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long ID;

	@Column(name="vorName")
	private String vorName;

	@Column(name="nachName")
	private String nachName;

	@Column(name="eMail",unique=true, nullable=false)
	private String eMail;

	@Column(name="passwort", nullable=false)
	private String passwort;

	@Column(name="smsNummer",unique=true, nullable=false)
	private String smsNummer;

	@Column(name="verbuchtePraemienMeilen")
	private Long verbuchtePraemienMeilen;

	@Column(name="tickets")
	private Ticket tickets;

	@Column(name="reservierungen")
	private Collection<Reservierung> reservierungen;

	public Long getID() { return ID; }

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getSmsNummer() {
		return smsNummer;
	}

	public void setSmsNummer(String smsNummer) {
		this.smsNummer = smsNummer;
	}

	public Long getVerbuchtePraemienMeilen() {
		return verbuchtePraemienMeilen;
	}

	public void setVerbuchtePraemienMeilen(Long verbuchtePraemienMeilen) {
		this.verbuchtePraemienMeilen = verbuchtePraemienMeilen;
	}

	public Ticket getTickets() {
		return tickets;
	}

	public void setTickets(Ticket tickets) {
		this.tickets = tickets;
	}

	public Collection<Reservierung> getReservierungen() {
		return reservierungen;
	}

	public void setReservierungen(Collection<Reservierung> reservierungen) {
		this.reservierungen = reservierungen;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Benutzer benutzer = (Benutzer) o;

		if (!getID().equals(benutzer.getID())) return false;
		if (getVorName() != null ? !getVorName().equals(benutzer.getVorName()) : benutzer.getVorName() != null)
			return false;
		if (getNachName() != null ? !getNachName().equals(benutzer.getNachName()) : benutzer.getNachName() != null)
			return false;
		if (!geteMail().equals(benutzer.geteMail())) return false;
		if (!getPasswort().equals(benutzer.getPasswort())) return false;
		if (!getSmsNummer().equals(benutzer.getSmsNummer())) return false;
		if (getVerbuchtePraemienMeilen() != null ? !getVerbuchtePraemienMeilen().equals(benutzer.getVerbuchtePraemienMeilen()) : benutzer.getVerbuchtePraemienMeilen() != null)
			return false;
		if (getTickets() != null ? !getTickets().equals(benutzer.getTickets()) : benutzer.getTickets() != null)
			return false;
		return getReservierungen() != null ? getReservierungen().equals(benutzer.getReservierungen()) : benutzer.getReservierungen() == null;
	}

	@Override
	public int hashCode() {
		int result = getID().hashCode();
		result = 31 * result + geteMail().hashCode();
		result = 31 * result + getPasswort().hashCode();
		result = 31 * result + getSmsNummer().hashCode();
		return result;
	}
}
