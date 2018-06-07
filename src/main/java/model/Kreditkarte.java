package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
@Entity
public class Kreditkarte implements Zahlung {

	public Kreditkarte()
	{
		super();
	}


	public void zahlungDurchfuehren() {

	}

}
