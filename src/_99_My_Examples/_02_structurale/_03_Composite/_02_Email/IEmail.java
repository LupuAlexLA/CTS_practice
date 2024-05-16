package _99_My_Examples._02_structurale._03_Composite._02_Email;

import java.util.List;

public interface IEmail {
    void receive(String emailContent);
    void insert(IEmail emailAddress);
    void delete(IEmail emailAddress);
    List<IEmail> getAll();
}
