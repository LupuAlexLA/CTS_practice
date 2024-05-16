package _99_My_Examples._02_structurale._03_Composite._02_Email;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup implements IEmail {
    private List<IEmail> emailAddresses = new ArrayList<>();

    @Override
    public void receive(String emailContent) {
        for (IEmail emailAddress : emailAddresses) {
            emailAddress.receive(emailContent);
        }
    }

    @Override
    public void insert(IEmail emailAddress) {
        emailAddresses.add(emailAddress);
    }

    @Override
    public void delete(IEmail emailAddress) {
        emailAddresses.remove(emailAddress);
    }

    @Override
    public List<IEmail> getAll() {
        return emailAddresses;
    }
}
