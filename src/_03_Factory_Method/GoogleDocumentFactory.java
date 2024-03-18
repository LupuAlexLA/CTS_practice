package _03_Factory_Method;

public class GoogleDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) {
        if(documentType == DocumentType.TEXT) {
            return new GoogleDocument();
        } else if(documentType == DocumentType.SPREADSHEET) {
            return new GoogleSpreadsheet();
        } else {
            throw new RuntimeException();
        }
    }
}
