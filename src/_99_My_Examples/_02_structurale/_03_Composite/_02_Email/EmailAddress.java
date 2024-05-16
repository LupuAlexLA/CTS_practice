package _99_My_Examples._02_structurale._03_Composite._02_Email;

import java.util.List;

public class EmailAddress implements IEmail {
    private String emailAddress;

    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void receive(String emailContent) {
        System.out.println(emailAddress + " : " + emailContent);
    }

    @Override
    public void insert(IEmail emailAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(IEmail emailAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<IEmail> getAll() {
        throw new UnsupportedOperationException();
    }
}
