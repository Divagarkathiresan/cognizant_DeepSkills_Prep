package AdapterPatternExample;

public class RazorPayAdapter implements PaymentProcessor{
    
    private RazorPay razorPay;

    public RazorPayAdapter(RazorPay razorPay){
        this.razorPay=razorPay;
    }
    @Override
    public void processPayment(){
        razorPay.show();
    }
}
