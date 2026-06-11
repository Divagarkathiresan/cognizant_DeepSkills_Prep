package FactoryPatternExample;

public class PDFDocument implements Document{
    @Override
    public void open(){
        System.err.println("PDF document opened");
    }
}
