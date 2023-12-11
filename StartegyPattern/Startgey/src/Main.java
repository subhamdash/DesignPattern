
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

/*
Certainly! Here are some use cases where the Strategy Pattern is commonly applied:

        Sorting Algorithms:

        The Strategy Pattern can be used to implement different sorting algorithms (e.g., quicksort, bubblesort, mergesort) and allow the client to choose the desired sorting strategy dynamically.
        Image Processing:

        In image processing applications, different filters and image enhancement algorithms can be implemented using the Strategy Pattern, allowing users to choose and apply different strategies based on their requirements.
        Data Compression:

        The Strategy Pattern can be used in data compression applications, where different compression algorithms (e.g., gzip, zip, lzma) can be encapsulated as strategies, and the client can switch between them.
        Authentication Systems:

        Authentication systems often have multiple methods (e.g., username/password, OAuth, biometric), and the Strategy Pattern can be used to encapsulate these authentication strategies, providing flexibility and extensibility.
        Payment Gateways:

        Payment processing systems can use the Strategy Pattern to implement different payment gateways (e.g., credit card, PayPal, Bitcoin) as interchangeable strategies.
        Game Development:

        In game development, the behavior of characters or enemies can be implemented using the Strategy Pattern. Different strategies for movement, attack, and defense can be encapsulated, and the game can dynamically switch between them.
        Cache Strategies:

        Caching systems can use the Strategy Pattern to implement different cache eviction policies (e.g., LRU, LFU), allowing the system to adapt to varying memory constraints.
        Logging Mechanisms:

        Logging in applications may involve different strategies such as writing logs to files, databases, or external services. The Strategy Pattern can be employed to encapsulate these logging strategies.
        Communication Protocols:

        In networking applications, different communication protocols (e.g., HTTP, FTP, MQTT) can be implemented using the Strategy Pattern, enabling flexibility in choosing the appropriate protocol for specific scenarios.
        Text Editors:

        Text editors may allow users to choose different text formatting or spell-checking strategies. The Strategy Pattern can be used to implement these features in a modular and extensible way.
*/