package AdapterPatternExample;

public class UPIPayAdapter implements PaymentProcessor{

    private UPIPay upiPay;

    public UPIPayAdapter(UPIPay upiPay){
        this.upiPay = upiPay;
    }
    
    @Override
    public void processPayment(){
        upiPay.show();
    }


}
