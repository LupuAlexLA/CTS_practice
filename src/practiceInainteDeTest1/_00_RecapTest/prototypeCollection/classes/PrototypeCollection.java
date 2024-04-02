package practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private Map<String, GameCharacter> collection = new HashMap<>();

    public PrototypeCollection() throws InterruptedException {
        collection.put(MALE, new MaleCharacter());
        collection.put(FEMALE, new FemaleCharacter());
    }

    public GameCharacter getCharacter(String characterType) throws CloneNotSupportedException {
        if(collection.containsKey(characterType)) {
            GameCharacter character = collection.get(characterType);
            return (GameCharacter) character.clone();
        } else {
            return null;
        }
    }
}
