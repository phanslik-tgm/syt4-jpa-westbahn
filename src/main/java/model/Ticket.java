package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
public abstract class Ticket {

	protected Long ID;

	protected Strecke strecke;

	protected Zahlung zahlung;

}
