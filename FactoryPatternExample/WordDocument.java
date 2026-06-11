package FactoryPatternExample;

public class WordDocument implements Document{
    @Override
    public void open(){
        System.err.println("Word document opened");
    }
}