package AllLocation;

public abstract  class PizzaStoreStandard {


    public PizzaAll orderPizza(String type_of_pizza)
    {
        PizzaAll pizza=CreatePizza(type_of_pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;

    }
    public abstract PizzaAll CreatePizza(String type);
}
