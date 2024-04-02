package practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes;

public class MaleCharacter extends GameCharacter implements Cloneable {
    private Image image;

    public MaleCharacter() throws InterruptedException {
        System.out.println("Loading character...");
        Thread.sleep(1000);
        image = new Image();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MaleCharacter copy = (MaleCharacter) super.clone();
        copy.image = (Image) image.clone();
        return copy;
    }
}
