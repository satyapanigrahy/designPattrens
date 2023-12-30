package designpatterns.factory;

public class PremiumClassFoodMenu implements FoodMenu {
    @Override
    public String getVegFoodMenu() {
        return "Premium VegMenu";
    }

    @Override
    public String getNonVegFoodMenu() {
        return "Premium NonVegMenu";
    }
}
