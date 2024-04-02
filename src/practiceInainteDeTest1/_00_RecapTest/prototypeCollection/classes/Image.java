package practiceInainteDeTest1._00_RecapTest.prototypeCollection.classes;

public class Image implements Cloneable {
    private int height;
    private int width;
    int[][] pixels = new int[50][50];

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Image copy = (Image)super.clone();
        copy.height = height;
        copy.width = width;
        copy.pixels = pixels.clone();
        return copy;
    }
}
