package designpatterns.factory;

public class PrimiumClassDrinksMenu implements Drinks {
    @Override
    public String getAlcoholicDrinksMenu() {
        return "pc-al-01,pc-al-02,pc-al-03,pc-al-04";
    }

    @Override
    public String getNonAlcoholicDrinksMenu() {
        return "pc-nal-01,pc-nal-02,pc-nal-03,pc-nal-04";
    }

    @Override
    public String getComplementaryDrinksMenu() {
        return "mocktail,hot/col water, juice";
    }
}
