package model;
import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;

public class Einzelticket extends Ticket
{

	public Einzelticket(Strecke strecke, Zahlung zahlung, TicketOption ticketOption) {
		super(strecke, zahlung);
		this.ticketOption = ticketOption;
	}

	@Column(name="ticketOption")
	private TicketOption ticketOption;

	public TicketOption getTicketOption() {
		return ticketOption;
	}

	public void setTicketOption(TicketOption ticketOption) {
		this.ticketOption = ticketOption;
	}
}
