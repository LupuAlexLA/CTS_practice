package _09_Composite;

public class Main {
    public static void main(String[] args) {
        EmailReceiver seriaD = new EmailGroup();

        EmailReceiver grupaX = new EmailGroup();
        EmailReceiver grupaY = new EmailGroup();

        EmailReceiver stud1 = new EmailAddress("pop.popescu@gmail.com");
        EmailReceiver stud2 = new EmailAddress("ion.ionescu@gmail.com");
        EmailReceiver stud3 = new EmailAddress("gog.gogescu@gmail.com");

        seriaD.addReceiver(grupaX);
        seriaD.addReceiver(grupaY);

        grupaX.addReceiver(stud1);
        grupaX.addReceiver(stud2);
        //grupaY.addReceiver(stud3);
        seriaD.addReceiver(stud3);

        seriaD.receive("Salutare");
    }
}
