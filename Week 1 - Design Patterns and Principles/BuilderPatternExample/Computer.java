package BuilderPatternExample;

public class Computer {
    private String name;
    private String model;
    private int RAM;

    Computer(String name,String model,int RAM){
        this.name=name;
        this.model=model;
        this.RAM=RAM;
    }

    public void show(){
        System.out.println(name +" "+model+" "+RAM);
    }
}
