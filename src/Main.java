import java.security.Signature;

public class Main {
    public static void main(String[] args) {
        TicketAgent agent = new TicketAgent();
        TicketBuilder economyTicketBuilder = new EconomyTicketBuilder();




        TicketBuilder businessTicketBuilder = new BusinessTicketBuilder();
        TicketBuilder vipTicketBuilder = new VIPTicketBuilder();

        //Ekonomi sınıfına ait biletler oluşturuyor
        agent.setTicketBuilder(economyTicketBuilder);
        agent.buildTicket();
        Ticket economyTicket = agent.getTicket();
        System.out.println("Economy Ticket: "+economyTicket);

        //Business sınıfına ait biletler oluşturuyor
        agent.setTicketBuilder(businessTicketBuilder);
        agent.buildTicket();
        Ticket businessTicket = agent.getTicket();
        System.out.println("*************************");
        System.out.println("Business Ticket: "+ businessTicket);

        //VIP sınıfına ait biletler oluşturuluyor
        agent.setTicketBuilder(vipTicketBuilder);
        agent.buildTicket();
        Ticket vipTicket = agent.getTicket();
        System.out.println("*************************");
        System.out.println("VIP Ticket: "+vipTicket);


    }
}