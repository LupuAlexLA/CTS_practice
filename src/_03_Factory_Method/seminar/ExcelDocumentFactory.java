package _03_Factory_Method.seminar;

public class ExcelDocumentFactory implements AbstractDocumentFactory{
    @Override
    public OfficeDocument createDocument() {
        return new ExcelDocument();
    }
}
