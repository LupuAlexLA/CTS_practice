package seminar09.main;

import seminar09.composite.EmailAddress;
import seminar09.composite.EmailGroup;
import seminar09.composite.EmailReceiver;
import seminar09.flyweight.CharacterPosition;
import seminar09.flyweight.CustomCharacterFactory;
import seminar09.flyweight.TextCharacter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite");
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

        System.out.println("Flyweight");

        CustomCharacterFactory factory = new CustomCharacterFactory();
        TextCharacter firstCharacter = factory.getCustomCharacter('a');
        TextCharacter secondCharacter = factory.getCustomCharacter('n');
        TextCharacter thirdCharacter = factory.getCustomCharacter('a');

        firstCharacter.display(new CharacterPosition(1, 1));
        secondCharacter.display(new CharacterPosition(1, 2));
        thirdCharacter.display(new CharacterPosition(1, 3));
    }
}
