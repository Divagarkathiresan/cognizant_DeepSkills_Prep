package BuilderPatternExample;

public class ComputerBuilder {
    String name;
    String model;
    int ram;

    public ComputerBuilder setname(String name){
        this.name=name;
        return this;
    }
    public ComputerBuilder setmodel(String model){
        this.model=model;
        return this;
    }
    public ComputerBuilder setram(int ram){
        this.ram=ram;
        return this;
    }

    public Computer Build(){
        return new Computer(name,model,ram);
    }
}
