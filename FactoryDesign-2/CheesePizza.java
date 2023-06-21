public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("We need to cheese and crust to melt it down");

    }

    @Override
    public void bake() {
        System.out.println("Take it , get it and Bake it");

    }

    @Override
    public void pack() {

    }
}
