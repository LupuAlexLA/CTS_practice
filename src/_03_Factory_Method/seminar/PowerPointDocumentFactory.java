package _03_Factory_Method.seminar;

public class PowerPointDocumentFactory implements AbstractDocumentFactory{
    @Override
    public OfficeDocument createDocument() {
        return new PowerpointDocument();
    }
}
