package _03_Factory_Method.seminar;

public class WordDocumentFactory implements AbstractDocumentFactory{
    @Override
    public OfficeDocument createDocument() {
        return new WordDocument();
    }
}
