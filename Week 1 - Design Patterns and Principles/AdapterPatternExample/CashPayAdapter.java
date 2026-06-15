package AdapterPatternExample;

public class CashPayAdapter implements PaymentProcessor{
    private CashPay cashPay;
    public CashPayAdapter(CashPay cashPay){
        this.cashPay=cashPay;
    }

    @Override
    public void processPayment(){
        cashPay.show();
    }
}
