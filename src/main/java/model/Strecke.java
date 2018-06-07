package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
public class Strecke {

	private Long ID;

	private Bahnhof start;

	private Bahnhof bahnhof;

	private Bahnhof ende;

}
