package _00_RecapTest.prototypeCollection.classes;

public class FemaleCharacter extends GameCharacter implements Cloneable {
    private Image image;

    public FemaleCharacter() throws InterruptedException {
        System.out.println("Loading character...");
        Thread.sleep(1000);
        image = new Image();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        FemaleCharacter copy = (FemaleCharacter) super.clone();
        copy.image = (Image) image.clone();
        return copy;
    }
}
