package designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        ITicket ticket = TicketGenerator.generateTicket(TicketTypes.ECONOMY);
        System.out.println(ticket.drinksMenu().alcoholicDrinksMenu());
        System.out.println(ticket.foodMenu().nonVegFoodMenu());
        System.out.println(ticket.seatDetails().seatDetails());
    }
}
