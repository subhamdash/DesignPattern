
public class Main {
    public static void main(String[] args) {
        PaymentContext b=new Bank();
        b.Transaction(100);


    }
}


//The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable.
// It lets the client use algorithms independently of the clients that use it.
//Advantages of the Strategy Pattern in this Use Case:
//Flexibility: It allows new payment methods to be added without modifying existing code. You can introduce new payment strategies (algorithms) without affecting the client code.
//
//Encapsulation: Each payment method is encapsulated in its own class, promoting a clean and modular design.
//
//Interchangeability: Clients can switch between different payment methods at runtime, making it easy to adapt to changing requirements.
//
//The Strategy Pattern proves beneficial in scenarios where you have a family of algorithms,
// and you want to make them interchangeable without altering the client code.