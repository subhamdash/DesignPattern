public class PaymentContext {

    PaymentStrategy payment_strategy;
    void Transaction(int amount)
    {
        payment_strategy.Process_Paymet(amount);
    }

}
