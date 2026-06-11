package BuilderPatternExample;
public class TestComputer{
    public static void main(String[] args){
        Computer comp=new ComputerBuilder()
                            .setname("HP")
                            .setmodel("Pavilion")
                            .setram(16)
                            .getComputer();
        comp.show();
    }
}