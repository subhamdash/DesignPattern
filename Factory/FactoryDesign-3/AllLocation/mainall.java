package AllLocation;

public class mainall {
    public static void main(String[] args) {
        PizzaStoreStandard pny=new NYStore();
        PizzaAll veggies=pny.orderPizza("Veggie");
        System.out.println(veggies);

        PizzaStoreStandard chi=new ChicagoStore();
        PizzaAll Cheese= chi.orderPizza("Cheese");


    }
}
