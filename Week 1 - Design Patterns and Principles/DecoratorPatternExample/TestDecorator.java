package DecoratorPatternExample;

public class TestDecorator {
    public static void main(String[] args){
        Notifier notify=new SMSNotifierDecorator(new EmailNotifier());
        notify.send();
    }
}
