package designpatterns.factory;

public class PremiumClassFoodMenu implements FoodMenu {
    @Override
    public String vegFoodMenu() {
        return "Premium VegMenu";
    }

    @Override
    public String nonVegFoodMenu() {
        return "Premium NonVegMenu";
    }
}
