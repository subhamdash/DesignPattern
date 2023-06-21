public class ShapeFactory {
    public Shapes getShapes(String shape) //Method with object as retrun type
    {
        if(shape.equalsIgnoreCase("CIRCLE"))
        {
            return new Circl();

        }
        else if(shape.equalsIgnoreCase("Rect"))
        {
            return new Rect();

        }

        else if(shape.equalsIgnoreCase("Traingle"))
        {
            return new Triang();

        }
//        else if(shape.equalsIgnoreCase("Square")) //If a Class is not implemented by the Shapes class then we cannot create any object
//        {
//            return new Square();
//
//        }

        return null;

    }
}
