package _99_My_Examples._03_comportamentale._01_Chain;

public abstract class QAHandler {
    protected QAHandler nextHandler;

    public void setNextHandler(QAHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void answerTheQuestion(String question);
}
