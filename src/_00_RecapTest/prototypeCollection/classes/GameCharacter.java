package _00_RecapTest.prototypeCollection.classes;

public abstract class GameCharacter {
    protected String name;
    protected String color;

    @Override
    public String toString() {
        return "MaleCharacter{" +
                "name='" + name + '\'' +
                ", clothesColor='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GameCharacter copy = (GameCharacter) super.clone();
        copy.name = name;
        copy.color = color;
        return copy;
    }
}
