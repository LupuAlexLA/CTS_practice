package test2.strategy;

public class Main {
    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        Mode mode = new Comfort();
        switcher.setMode(mode);
        try {
            System.out.println(switcher.changeHp());

        } catch (ModeNotSetException e) {
            throw new RuntimeException(e);
        }

        mode = new Sport();
        switcher.setMode(mode);
        try {
            System.out.println(switcher.changeHp());
        } catch (ModeNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
