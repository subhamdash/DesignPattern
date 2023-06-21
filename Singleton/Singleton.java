//What is singleton class- FOr any Java class if we are allowed to create only one Object then it is called Singleton
//Runtime, ServiceLoader,
//If every person want run-time object then it is difficult to create seperate object ofr everyone.Instead make a single object.
//Re-Use the same object so that it will be helpful for us
//Appraoch -1

import java.time.temporal.Temporal;

class signtest
{
    private signtest() //Making it private so that no outside class can make object for this class
    {

    }
    //private static signtest t=new signtest();  //Creating an object for the class
    //We can have alternative for this as well we can intialize the object value as null and We can go ahead and
    //create object when required this is known as lazy instantion .
    private static signtest t=null;

    public static signtest getSigntest() //The reason to make this static so that we can directly access without creating object,with classname
    {
        if(t==null)
        {
            t= new signtest();
        }
        return t;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
public class Singleton {
    public static void main(String[] args) {
        //signtest s=new signtest(); We cannot create as the constructor is private
        /* So how can we create an object for signtest */
        signtest s=signtest.getSigntest();
        s.showMessage();



    }
}
