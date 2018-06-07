package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;
public class Einzelticket extends Ticket {

	private TicketOption ticketOption;

}
