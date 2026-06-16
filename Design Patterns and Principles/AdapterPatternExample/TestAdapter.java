package AdapterPatternExample;

public class TestAdapter {
    public static void main(String[] args){
        
        PaymentProcessor payment_processor = new UPIPayAdapter(new UPIPay());
        payment_processor.processPayment();
        
        PaymentProcessor paymentProcessor=new RazorPayAdapter(new RazorPay());
        paymentProcessor.processPayment();

        PaymentProcessor payment_Processor=new CashPayAdapter(new CashPay());
        payment_Processor.processPayment();

    }
}
