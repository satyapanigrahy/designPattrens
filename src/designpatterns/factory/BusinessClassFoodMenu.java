package designpatterns.factory;

public class BusinessClassFoodMenu implements FoodMenu {
    @Override
    public String getVegFoodMenu() {
        return "Business VegMenu";
    }

    @Override
    public String getNonVegFoodMenu() {
        return "Business NonVegMenu";
    }
}
