package test2_something_else.state;

public class Aspirator {
    public AspiratorState state;

    public Aspirator() {
        this.state = new AspiraPrafState();
        state.doAction();
    }

    public void setState(AspiratorState state) {
        this.state = state;
    }

    public void umezestePodeaua() {
        setState(new UmezestePodeaState());
        state.doAction();
    }

    public void usucaPodeaua() {
        setState(new UsucaPodeaState());
        state.doAction();
    }
}
