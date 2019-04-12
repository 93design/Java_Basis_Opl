package Bar;

import java.util.LinkedList;
import java.util.List;

 public class Register {
	
	List<Ticket> tickets = new LinkedList<>();
	private double profit;

	public void addTicket(Ticket ticket1) {
		tickets.add(ticket1);
		profit += ticket1.getPrice();
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public double getProfit() {
		return profit;
	}

	public void acceptTicket(Ticket ticket1) {
		this.tickets.add(ticket1);
		this.profit += ticket1.getPrice();
	}
	
	

}
