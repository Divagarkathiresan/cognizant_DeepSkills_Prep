package FactoryPatternExample;


public class TestFactory {
    public static void main(String[] args){

        DocumentFactory wordDocFact=new WordDocumentFactory();
        Document Word=wordDocFact.createDocument();
        Word.open();
        DocumentFactory PDFDocFact=new PDFDocumentFactory();
        Document PDF=PDFDocFact.createDocument();
        PDF.open();
        DocumentFactory ExcelDocFact=new WordDocumentFactory();
        Document Excel=ExcelDocFact.createDocument();
        Excel.open();
    }
}
