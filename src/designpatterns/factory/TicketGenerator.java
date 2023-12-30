package designpatterns.factory;

public class TicketGenerator {
    private TicketTypes ticketTypes;

    public static TicketClass generateTicket(TicketTypes ticketTypes){
        return switch (ticketTypes){
            case ECONOMY -> new EconomyClass();
            case PREMIUM -> new PremiumClass();
            case BUSINESS -> new BusinessClass();
        };
    }
}
