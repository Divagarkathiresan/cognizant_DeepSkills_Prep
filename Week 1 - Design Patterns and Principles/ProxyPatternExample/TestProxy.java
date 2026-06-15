package ProxyPatternExample;

public class TestProxy {
    public static void main(String[] args){
        String str="Java.jpeg";
        Image image=new ProxyImage(str);
        image.display();

        image.display();
    }
}
