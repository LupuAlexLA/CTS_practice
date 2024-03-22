package _04_Prototype;

public class StoneBlock extends BuildingBlock {
    private byte[] texture;

    public StoneBlock() {
        System.out.println("Loading texture...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.texture = new byte[] {4, 5, 6};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock copy = (StoneBlock) super.clone();
        copy.texture = this.texture.clone();
        return copy;
    }

    @Override
    public void render() {
        System.out.println("Rendering the stone block...");
    }
}
