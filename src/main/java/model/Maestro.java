package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
@Entity
public class Maestro implements Zahlung {

	public Maestro()
	{
		super();
	}

	public void zahlungDurchfuehren() {

	}

}
