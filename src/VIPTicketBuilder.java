public class VIPTicketBuilder implements TicketBuilder{
    private Ticket ticket;
    @Override
    public void buildPassangerName() {
        ticket.setPassangerName("Eylül EREN");
    }

    @Override
    public void buildDepartureLocation() {
        ticket.setDepartureLocation("Çanakkale Havalimanı");
    }

    @Override
    public void buildDestination() {
        ticket.setDestination("Ankara Esenboğa Havalimanı");
    }

    @Override
    public void buildDate() {
        ticket.setDate("14-06-2024");
    }

    @Override
    public void buildSeatNumber() {
        ticket.setSeatNumber("2C");
    }

    @Override
    public Ticket getTicket() {
        return ticket;
    }
    public VIPTicketBuilder(){
        this.ticket = new Ticket();
    }
}
