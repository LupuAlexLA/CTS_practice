package _99_My_Examples._03_comportamentale._04_Memento;

public class Main {
    public static void main(String[] args) {
        Ide ide = new Ide();

        ide.typeCode("sout - Hello World; ");
        ide.save();

        System.out.println(ide);

        ide.typeCode("For loop; ");
        ide.save();

        System.out.println(ide);

        ide.typeCode("While loop;");
        ide.save();

        ide.undo();
        System.out.println(ide);

        ide.undo();
        System.out.println(ide);

        ide.undo();
        System.out.println(ide);
    }
}
