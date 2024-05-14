package _99_My_Examples._03_comportamentale._07_Template._02_Robot;

public abstract class PartMover {
    public final void move() {
        met1();
        met2();
        met3();
    }

    protected abstract void met1();
    protected abstract void met2();
    protected abstract void met3();
}
