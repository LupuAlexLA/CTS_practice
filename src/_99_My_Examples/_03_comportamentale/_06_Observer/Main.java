package _99_My_Examples._03_comportamentale._06_Observer;

public class Main {
    public static void main(String[] args) {
        Measurement harta = new Measurement("Piata Victoriei");

        Member member1 = new Member();
        harta.subscribe(member1);

        Member member2 = new Member();
        harta.subscribe(member2);

        harta.publishNewMeasurement("e poluata eletromagnetic");

        harta.unsubscribe(member2);

        harta.publishNewMeasurement("e foarte poluata eletromagnetic");
    }
}
