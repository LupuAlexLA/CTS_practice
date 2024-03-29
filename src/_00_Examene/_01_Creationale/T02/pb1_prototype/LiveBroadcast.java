package _00_Examene._01_Creationale.T02.pb1_prototype;

import java.util.ArrayList;
import java.util.List;

public class LiveBroadcast implements Live, Cloneable {
    private String title;
    private byte[] stream; // presupunem că acesta este fluxul de date pentru transmisia live
    private List<String> comments;

    public LiveBroadcast(String title, byte[] stream) {
        this.title = title;
        this.stream = stream;
        this.comments = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle() {
        this.title = title;
    }

    @Override
    public byte[] getStream() {
        return stream.clone(); // asigurăm că fluxul este clonat pentru a preveni scurgerile de referințe
    }

    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments); // returnăm o copie a listei pentru a preveni modificările externe
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public LiveBroadcast clone() {
        try {
            LiveBroadcast copy = (LiveBroadcast) super.clone();
            // Asigurăm că lista de comentarii este de asemenea clonată
            copy.comments = new ArrayList<>(this.comments);
            // Nu clonăm stream-ul deoarece este comun tuturor transmisiunilor
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Nu ar trebui să se întâmple, deoarece suportăm clonarea
        }
    }
}