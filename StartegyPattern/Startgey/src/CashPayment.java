public class CashPayment implements PaymentStrategy{

    @Override
    public void Process_Paymet(int amount) {
        System.out.println("We are processing "+ amount+" through Cash Payment");
    }
}
