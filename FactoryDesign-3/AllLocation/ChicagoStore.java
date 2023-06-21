package AllLocation;

public class ChicagoStore extends PizzaStoreStandard {
    @Override
    public PizzaAll CreatePizza(String type) {
        if(type.equalsIgnoreCase("Cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equalsIgnoreCase("Veggie"))
            return new ChicagoStylePizaaVeggie();
        return null;
    }
}
