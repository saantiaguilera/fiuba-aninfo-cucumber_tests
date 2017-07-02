package fiuba.aninfo.entity;

public class UserExternal extends User {

	public boolean setTicketClassification(Ticket which, Ticket.Classification how) {
		return false; // You cant.
	}

	public boolean addTicketAssignee(Ticket which, User who) {
		return false; // You cant.
	}

}