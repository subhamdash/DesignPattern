public class Bank extends PaymentContext {
    Bank()
    {
        payment_strategy=new CashPayment();

    }
}
