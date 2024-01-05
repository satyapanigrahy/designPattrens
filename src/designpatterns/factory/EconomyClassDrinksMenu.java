package designpatterns.factory;

public class EconomyClassDrinksMenu implements Drinks {

    public EconomyClassDrinksMenu(){

    }
    @Override
    public String alcoholicDrinksMenu() {
        return "ec-al-01,ec-al-02,ec-al-03,ec-al-04";
    }

    @Override
    public String nonAlcoholicDrinksMenu() {
        return "ec-nal-01,ec-nal-02,ec-nal-03,ec-nal-04";
    }

    @Override
    public String complementaryDrinksMenu() {
        return "Lemon Juice, Hot water, cold water etc";
    }
}
