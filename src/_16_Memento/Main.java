package _16_Memento;

public class Main {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        System.out.println(videoEditor);

        videoEditor.edit(5);
        videoEditor.save();

        System.out.println(videoEditor);
        videoEditor.edit(3);

        System.out.println(videoEditor);
        videoEditor.undo();

        System.out.println(videoEditor);
    }
}
