package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb1_recap;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        byte[] streamData = new byte[] {1, 2, 3};
        LiveBroadcast original = new LiveBroadcast("The news", streamData);

        LiveBroadcast firstChannel = (LiveBroadcast) original.clone();
        LiveBroadcast secondChannel = (LiveBroadcast) original.clone();
        LiveBroadcast thirdChannel = (LiveBroadcast) original.clone();

        firstChannel.addComment("ce frumos");
        secondChannel.addComment("ce urat");
        thirdChannel.addComment("ce minunat");

        System.out.println("Comentarii C1: " + firstChannel.getComments());
        System.out.println("Comentarii C2: " + secondChannel.getComments());
        System.out.println("Comentarii C3: " + thirdChannel.getComments());
    }
}
