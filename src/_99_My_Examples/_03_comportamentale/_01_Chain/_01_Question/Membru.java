package _99_My_Examples._03_comportamentale._01_Chain._01_Question;

public class Membru extends QAHandler {

    public static final String BASIC = "BASIC";

    @Override
    public void answerTheQuestion(String question) {
        if(BASIC.equals(question)) {
            System.out.println("The member response!");
        } else {
            if(nextHandler != null) {
                nextHandler.answerTheQuestion(question);
            }
        }
    }
}
