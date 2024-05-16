package _99_My_Examples._02_structurale._03_Composite._02_Email;

public class Main {
    public static void main(String[] args) {
        IEmail emailAdress1 = new EmailAddress("stud1@...");
        IEmail emailAdress2 = new EmailAddress("stud2@...");
        IEmail emailAdress3 = new EmailAddress("stud3@...");

        IEmail emailSubGroup1 = new EmailGroup();
        IEmail emailSubGroup2 = new EmailGroup();

        IEmail emailGroup = new EmailGroup();

        emailGroup.insert(emailSubGroup1);
        emailGroup.insert(emailSubGroup2);

        emailSubGroup1.insert(emailAdress1);
        emailSubGroup2.insert(emailAdress2);
        emailSubGroup2.insert(emailAdress3);

        emailGroup.receive("Buna seara studenti!!!");
    }
}
