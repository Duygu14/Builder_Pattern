//Builder (oluşturucu) -> Ticket arayüzü
public interface TicketBuilder {
    void buildPassangerName();
    void buildDepartureLocation();
    void buildDestination();
    void buildDate();
    void buildSeatNumber();
    Ticket getTicket();
}
