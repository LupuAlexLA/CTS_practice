package practiceInainteDeTest1._00_RecapTest.anotherPrototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        byte[] stream = new byte[] {1, 2, 3};
        Broadcast original = new Broadcast("emisiunea X", stream);

        Broadcast clone1 = (Broadcast) original.clone();
        Broadcast clone2 = (Broadcast) original.clone();
        Broadcast clone3 = (Broadcast) original.clone();

        clone1.addComment("schimba pe altceva");
        clone2.addComment("lasa aici");
        clone3.addComment("da mai tare");

        System.out.println(clone1.getComments());
        System.out.println(clone2.getComments());
        System.out.println(clone3.getComments());
    }
}
