package SingletonPatternExample;

public class Logger{
    private static Logger instance;
    
    private Logger(){
        System.out.println("Logger Created");
    }
    public static Logger getInstance(){
        if(instance == null){
            instance=new Logger();
            return instance;
        }
        return instance;
    }
    public void logMessage(String str){
        System.out.println("[LOG] : "+str);
    }
}