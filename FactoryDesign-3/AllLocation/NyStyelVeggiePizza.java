package AllLocation;
public class NyStyelVeggiePizza implements PizzaAll  {
    @Override
    public void prepare() {
        System.out.println("We are loading pizza");

    }

    @Override
    public void bake() {
        System.out.println("We are Putting it oven for Baking");

    }

    @Override
    public void cut() {
        System.out.println("I am cuting it Slices");

    }

    @Override
    public void pack() {
        System.out.println("Packed in the Box");

    }
}
