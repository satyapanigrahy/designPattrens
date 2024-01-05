package designpatterns.factory;
/*Abstract Factory*/
public interface ITicket {
    Drinks drinksMenu();
    FoodMenu foodMenu();
    SeatDetails seatDetails();
}
