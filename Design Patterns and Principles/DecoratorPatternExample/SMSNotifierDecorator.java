package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator{

    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(){
        super.send();
        System.out.println("Send by SMS");
    }
}
