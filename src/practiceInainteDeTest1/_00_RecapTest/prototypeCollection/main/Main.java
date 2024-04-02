package practiceInainteDeTest1._00_RecapTest.prototypeCollection.main;

import practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes.FemaleCharacter;
import practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes.GameCharacter;
import practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes.MaleCharacter;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        GameCharacter c1 = new MaleCharacter();
        c1.setName("John");
        c1.setColor("black");
        System.out.println(c1);

        GameCharacter c2 = new FemaleCharacter();
        c1.setName("Hellen");
        c1.setColor("white");
        System.out.println(c2);

        GameCharacter cloneC1 = (GameCharacter) c1.clone();
        cloneC1.setName("Swain");
        cloneC1.setColor("green");
        System.out.println(cloneC1);

        GameCharacter cloneC2 = (GameCharacter) c2.clone();
        cloneC2.setName("Sivir");
        cloneC2.setColor("gold");
        System.out.println(cloneC2);
    }
}
