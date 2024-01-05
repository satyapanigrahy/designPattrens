package designpatterns.factory;

public class TicketGenerator {
    private TicketTypes ticketTypes;
    private ITicket iTicket;

    /*Factory Method*/
    public static ITicket generateTicket(TicketTypes ticketTypes){
        return switch (ticketTypes){
            case ECONOMY -> new EconomyClass();
            case PREMIUM -> new PremiumClass();
            case BUSINESS -> new BusinessClass();
        };
    }
}
