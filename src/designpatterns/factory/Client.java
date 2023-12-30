package designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        TicketClass ticket = TicketGenerator.generateTicket(TicketTypes.ECONOMY);
        System.out.println(ticket.getDrinksMenu().getAlcoholicDrinksMenu());
        System.out.println(ticket.getFoodMenu().getNonVegFoodMenu());
        System.out.println(ticket.getSeatDetails().getSeatDetails());
    }
}
