package _09_Composite.vers1_simple;

public class Main {
    public static void main(String[] args) {
        EmailGroup seriaD = new EmailGroup();
        EmailGroup grupa_1084 = new EmailGroup();
        EmailGroup grupa_1085 = new EmailGroup();

        EmailAddress stud1 = new EmailAddress("pop.popescu@csie.ro");
        EmailAddress stud2 = new EmailAddress("ion.ionescu@csie.ro");
        EmailAddress stud3 = new EmailAddress("gigel.georgescu@csie.ro");

        grupa_1084.addReceiver(stud1);
        grupa_1084.addReceiver(stud2);

        grupa_1085.addReceiver(stud3);

        seriaD.addReceiver(grupa_1084);
        seriaD.addReceiver(grupa_1085);

        seriaD.receive("bun venit!");
    }
}
