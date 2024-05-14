package _99_My_Examples._03_comportamentale._01_Chain._01_Question;

public class Specialist extends QAHandler {
    @Override
    public void answerTheQuestion(String question) {
        if("ADVANCED".equals(question)) {
            System.out.println("The specialist response!");
        } else {
            if(nextHandler != null) {
                nextHandler.answerTheQuestion(question);
            }
        }
    }
}
