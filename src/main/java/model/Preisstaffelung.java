package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
@Entity
public class Preisstaffelung {

	public Preisstaffelung(float grossGepaeck, float fahrrad, int zeitkarteWoche, int zeitkarteMonat, int zeitkarteJahr) {
		super();
		this.grossGepaeck = grossGepaeck;
		this.fahrrad = fahrrad;
		this.zeitkarteWoche = zeitkarteWoche;
		this.zeitkarteMonat = zeitkarteMonat;
		this.zeitkarteJahr = zeitkarteJahr;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serialVersionUID")
	private static Long serialVersionUID;

	@Column(name="grossGepaeck")
	private float grossGepaeck = 1.02f;

	@Column(name="fahrrad")
	private float fahrrad = 1.05f;

	@Column(name="zeitkarteWoche")
	private int zeitkarteWoche = 8;

	@Column(name="zeitkarteMonat")
	private int zeitkarteMonat = 25;

	@Column(name="zeitkarteJahr")
	private int zeitkarteJahr = 250;

	@Column(name="instance")
	private static Preisstaffelung instance;


	public static Preisstaffelung getInstance() {
		return null;
	}

	private Preisstaffelung() {

	}

	public static Long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(Long serialVersionUID) {
		Preisstaffelung.serialVersionUID = serialVersionUID;
	}

	public float getGrossGepaeck() {
		return grossGepaeck;
	}

	public void setGrossGepaeck(float grossGepaeck) {
		this.grossGepaeck = grossGepaeck;
	}

	public float getFahrrad() {
		return fahrrad;
	}

	public void setFahrrad(float fahrrad) {
		this.fahrrad = fahrrad;
	}

	public int getZeitkarteWoche() {
		return zeitkarteWoche;
	}

	public void setZeitkarteWoche(int zeitkarteWoche) {
		this.zeitkarteWoche = zeitkarteWoche;
	}

	public int getZeitkarteMonat() {
		return zeitkarteMonat;
	}

	public void setZeitkarteMonat(int zeitkarteMonat) {
		this.zeitkarteMonat = zeitkarteMonat;
	}

	public int getZeitkarteJahr() {
		return zeitkarteJahr;
	}

	public void setZeitkarteJahr(int zeitkarteJahr) {
		this.zeitkarteJahr = zeitkarteJahr;
	}

	public static void setInstance(Preisstaffelung instance) {
		Preisstaffelung.instance = instance;
	}
}
