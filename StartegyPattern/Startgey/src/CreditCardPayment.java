public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void Process_Paymet(int amount) {
        System.out.println("We are processing "+ amount+" through Credit Card");
    }
}
