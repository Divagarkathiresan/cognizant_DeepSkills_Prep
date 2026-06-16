package BuilderPatternExample;
public class TestComputer{
    public static void main(String[] args){
        Computer comp=new ComputerBuilder()
                            .setmodel("Pavilion")
                            .setname("HP")
                            .setram(16)
                            .Build();
        comp.show();
    }
}