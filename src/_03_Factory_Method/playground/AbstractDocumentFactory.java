package _03_Factory_Method.playground;

public interface AbstractDocumentFactory {
    Document getDocument(DocumentType documentType);
}
