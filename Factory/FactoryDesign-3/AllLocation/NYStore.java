package AllLocation;

public class NYStore extends PizzaStoreStandard{
    @Override
    public PizzaAll CreatePizza(String type) {
        if(type.equalsIgnoreCase("Cheese"))
            return new NyStyelVeggiePizza();
        else if(type.equalsIgnoreCase("Veggie"))
            return new NyStyelVeggiePizza();
        return null;
    }
}
