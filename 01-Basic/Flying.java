//
//Here’s another way to think about this principle:
// take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.

class Duck{
    public void swim()
    {
        System.out.println("I can swim hell yeah");
    }

    public void fly()
    {
        System.out.println("I can fly ");
    }
    public void quack()
    {
        System.out.println("Quack!! Quack!! ");
    }

}
class MalardDuck extends Duck{



}

class RubberDuck extends Duck{

    //Here we can have fly method even if it doesn't fly
    //We could have put fly in another interface but that would make our work more difficult to do


}

public class Flying {
    public static void main(String[] args) {
        Duck d=new RubberDuck();
        d.fly(); //So here even though we are not over-riding we see Rubber Duck can fly
        //It would be tedious to overiride this method in every class


    }
}

