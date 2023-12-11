public class FactoryPizza {

    public Pizza CreatePizza(String type)
    {
        if(type.equalsIgnoreCase("Veggie"))
        {
            return new VeggiePizza();
        }
        else if(type.equalsIgnoreCase("Cheese"))
        {
            return new CheesePizza();
        }
        else if(type.equalsIgnoreCase("Overloaded"))
        {
            return new OverloadedPizza();
        }

        return null;
    }
}
