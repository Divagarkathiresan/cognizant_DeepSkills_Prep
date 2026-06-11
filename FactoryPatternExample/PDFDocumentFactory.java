package FactoryPatternExample;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PDFDocument();
    }
}