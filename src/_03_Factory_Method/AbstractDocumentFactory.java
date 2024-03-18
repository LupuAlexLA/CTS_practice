package _03_Factory_Method;

public interface AbstractDocumentFactory {
    Document getDocument(DocumentType documentType);
}
