package my_version_09_Composite.vers2_abstract;

public interface EmailComposite extends Recipient {
    void addRecipient(Recipient recipient);
    void removeRecipient(Recipient recipient);
    Recipient getRecipient(int position);
}
