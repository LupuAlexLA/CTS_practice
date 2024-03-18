package _03_Factory_Method;

public class MainFactoryMethod {
    public static void main(String[] args) {
        AbstractDocumentFactory googleFactory = new GoogleDocumentFactory();
        AbstractDocumentFactory microsoftFactory = new MicrosoftDocumentFactory();
        try {
            Document googleDoc = googleFactory.getDocument(DocumentType.TEXT);
            googleDoc.setName("Licenta");
            googleDoc.open();

            Document googleSS = googleFactory.getDocument(DocumentType.SPREADSHEET);
            googleSS.setName("Buget");
            googleSS.open();

            Document microsoftWord = microsoftFactory.getDocument(DocumentType.TEXT);
            microsoftWord.setName("Raport");
            microsoftWord.open();

            Document microsoftExcel = microsoftFactory.getDocument((DocumentType.SPREADSHEET));
            microsoftExcel.setName("Masuratori personale");
            microsoftExcel.open();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }
}
