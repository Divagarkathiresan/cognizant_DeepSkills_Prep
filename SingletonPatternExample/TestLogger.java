package SingletonPatternExample;
public class TestLogger {
    public static void main(String[] args){
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();

        l1.logMessage("App started");
        l2.logMessage("Database started"); 

        System.out.println(l1==l2);
    }
}
