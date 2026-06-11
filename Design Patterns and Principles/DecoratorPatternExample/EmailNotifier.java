package DecoratorPatternExample;

public class EmailNotifier implements Notifier{
    
    @Override
    public void send(){
        System.out.println("Send by email");
    }
}
