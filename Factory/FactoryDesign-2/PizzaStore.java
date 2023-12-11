public class PizzaStore {
    FactoryPizza factory=null;

    public PizzaStore(FactoryPizza factory)
    {
        this.factory=factory;

    }

    public Pizza orderPizza(String type_of_pizza)
    {
        Pizza pizza=factory.CreatePizza(type_of_pizza);
        pizza.prepare();
        pizza.bake();

        return pizza;


    }
}
class main123
{
    public static void main(String[] args) {
        FactoryPizza ff=new FactoryPizza();
        PizzaStore f=new PizzaStore(ff);
        f.orderPizza("Cheese ");
       System.out.println(f);






    }
}
