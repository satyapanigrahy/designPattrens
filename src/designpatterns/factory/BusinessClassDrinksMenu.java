package designpatterns.factory;

public class BusinessClassDrinksMenu implements Drinks {
    @Override
    public String getAlcoholicDrinksMenu() {
        return "bc-al-01,bc-al-02,bc-al-03,bc-al-04";
    }

    @Override
    public String getNonAlcoholicDrinksMenu() {
        return "bc-nal-01,bc-nal-02,bc-nal-03,bc-nal-04";
    }

    @Override
    public String getComplementaryDrinksMenu() {
        return "mocktails,soda,sprinkled water";
    }
}
