package _03_Factory_Method;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) {
        if(documentType == DocumentType.TEXT) {
            return new MicrosoftWord();
        } else if(documentType == DocumentType.SPREADSHEET) {
            return new MicrosoftExcel();
        } else {
            throw new RuntimeException();
        }
    }
}
