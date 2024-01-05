package designpatterns.factory;

public class EconomyClassFoodMenu implements FoodMenu {

    public EconomyClassFoodMenu(){

    }
    @Override
    public String vegFoodMenu() {
        return "Economy VegMenu";
    }

    @Override
    public String nonVegFoodMenu() {
        return "Economy NonVegMenu";
    }
}
