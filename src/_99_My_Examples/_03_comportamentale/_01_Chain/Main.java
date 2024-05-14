package _99_My_Examples._03_comportamentale._01_Chain;

public class Main {
    public static void main(String[] args) {
        QAHandler membru = new Membru();
        QAHandler admin = new Admin();
        QAHandler specialist = new Specialist();

        membru.setNextHandler(admin);
        admin.setNextHandler(specialist);

        membru.answerTheQuestion("BASIC");
        membru.answerTheQuestion("MEDIUM");
        membru.answerTheQuestion("ADVANCED");
    }
}
