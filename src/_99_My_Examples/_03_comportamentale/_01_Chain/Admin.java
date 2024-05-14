package _99_My_Examples._03_comportamentale._01_Chain;

public class Admin extends QAHandler {

    public static final String MEDIUM = "MEDIUM";

    @Override
    public void answerTheQuestion(String question) {
        if(MEDIUM.equals(question)) {
            System.out.println("The admin response!");
        } else {
            if(nextHandler != null) {
                nextHandler.answerTheQuestion(question);
            }
        }
    }
}
