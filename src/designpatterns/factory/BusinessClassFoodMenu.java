package designpatterns.factory;

public class BusinessClassFoodMenu implements FoodMenu {
    @Override
    public String vegFoodMenu() {
        return "Business VegMenu";
    }

    @Override
    public String nonVegFoodMenu() {
        return "Business NonVegMenu";
    }
}
