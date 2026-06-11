package FactoryPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Excel document opened");
    }
}
