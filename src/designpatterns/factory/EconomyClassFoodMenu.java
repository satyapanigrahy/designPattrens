package designpatterns.factory;

public class EconomyClassFoodMenu implements FoodMenu {

    public EconomyClassFoodMenu(){

    }
    @Override
    public String getVegFoodMenu() {
        return "Economy VegMenu";
    }

    @Override
    public String getNonVegFoodMenu() {
        return "Economy NonVegMenu";
    }
}
