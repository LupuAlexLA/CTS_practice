package _99_My_Examples._03_comportamentale._07_Template._02_Robot;

public class Main {
    public static void main(String[] args) {
        PartMover partMover = new Robot1();
        partMover.move();

        partMover = new Robot2();
        partMover.move();
    }
}
