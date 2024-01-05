package designpatterns.factory;

public class BusinessClassDrinksMenu implements Drinks {
    @Override
    public String alcoholicDrinksMenu() {
        return "bc-al-01,bc-al-02,bc-al-03,bc-al-04";
    }

    @Override
    public String nonAlcoholicDrinksMenu() {
        return "bc-nal-01,bc-nal-02,bc-nal-03,bc-nal-04";
    }

    @Override
    public String complementaryDrinksMenu() {
        return "mocktails,soda,sprinkled water";
    }
}
