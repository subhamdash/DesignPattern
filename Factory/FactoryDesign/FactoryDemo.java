public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        //Shapes shape= new Circl(); -- We want to hide this So we are writing below method
        Shapes shape1=shapeFactory.getShapes("Circle");//
        shape1.draw();

        Shapes shape2=shapeFactory.getShapes("Traingle");//
        shape2.draw();


    }
}
