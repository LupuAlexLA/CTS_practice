package _04_Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        BuildingBlock block1 = new WoodBlock();
        BuildingBlock block2 = new StoneBlock();

        BuildingBlock block3;
        try {
            block3 = (BuildingBlock) block1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        BuildingBlock block4;
        try {
            block4 = (BuildingBlock) block2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        block1.render();
        block2.render();
        block3.render();
        block4.render();
    }
}
