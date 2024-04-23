package _10_Flyweight;

public class Main {
    public static void main(String[] args) {
        CustomCharacterFactory factory = new CustomCharacterFactory();
        TextCharacter firstCharacter = factory.getCustomCharacter('a');
        TextCharacter secondCharacter = factory.getCustomCharacter('n');
        TextCharacter thirdCharacter = factory.getCustomCharacter('a');

        firstCharacter.display(new CharacterPosition(1, 1));
        secondCharacter.display(new CharacterPosition(1, 2));
        thirdCharacter.display(new CharacterPosition(1, 3));
    }
}
