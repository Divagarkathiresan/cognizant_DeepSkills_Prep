package BuilderPatternExample;

public class Computer {
    private String name;
    private String model;
    private int RAM;

    Computer(ComputerBuilder computerBuilder){
        this.name=computerBuilder.name;
        this.model=computerBuilder.model;
        this.RAM=computerBuilder.ram;
    }

    public void show(){
        System.out.println(name +" "+model+" "+RAM);
    }
}
