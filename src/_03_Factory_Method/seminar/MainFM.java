package _03_Factory_Method.seminar;

public class MainFM {
    public static void main(String[] args) {
        AbstractDocumentFactory factory = new WordDocumentFactory();
        OfficeDocument document = factory.createDocument();
        document.open();
    }
}
