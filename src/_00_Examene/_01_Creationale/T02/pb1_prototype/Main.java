package _00_Examene._01_Creationale.T02.pb1_prototype;

import _00_Examene._01_Creationale.T02.pb1_prototype.LiveBroadcast;

public class Main {
    public static void main(String[] args) {
        byte[] streamData = new byte[] {1, 2, 3}; // Exemplu de stream
        LiveBroadcast originalBroadcast = new LiveBroadcast("Eveniment Live", streamData);

        // Creăm clone pentru diferite platforme
        LiveBroadcast facebookLive = originalBroadcast.clone();
        LiveBroadcast youtubeLive = originalBroadcast.clone();
        LiveBroadcast twitterLive = originalBroadcast.clone();

        // Adăugăm comentarii specifice pentru fiecare platformă
        facebookLive.addComment("Super eveniment!");
        youtubeLive.addComment("Uimitor!");
        twitterLive.addComment("Foarte interesant!");

        // Demonstrație că comentariile sunt unice pentru fiecare platformă
        System.out.println("Comentarii Facebook Live: " + facebookLive.getComments());
        System.out.println("Comentarii YouTube Live: " + youtubeLive.getComments());
        System.out.println("Comentarii Twitter Live: " + twitterLive.getComments());
    }
}
