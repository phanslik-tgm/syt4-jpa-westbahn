package model;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;

@Entity
public class Zeitkarte extends Ticket {

	public Zeitkarte(Strecke strecke, Zahlung zahlung, Date gueltigAb, ZeitkartenTyp typ) {
		super(strecke, zahlung);
		this.gueltigAb = gueltigAb;
		this.typ = typ;
	}

	private Date gueltigAb;

	private ZeitkartenTyp typ;

	public Date getGueltigAb() {
		return gueltigAb;
	}

	public void setGueltigAb(Date gueltigAb) {
		this.gueltigAb = gueltigAb;
	}

	public ZeitkartenTyp getTyp() {
		return typ;
	}

	public void setTyp(ZeitkartenTyp typ) {
		this.typ = typ;
	}
}
