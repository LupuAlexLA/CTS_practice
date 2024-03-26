package _00_Examene._01_Creationale.T02.pb1_prototype;

import java.util.List;

public class FacebookNews implements Live, Cloneable {
    private String title;
    private byte[] stream;
    private List<String> comments;

    public FacebookNews(String title) {
        System.out.println("Uploading news...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.title = title;
        this.stream = new byte[] {1,2,3};
        this.comments = null;
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
        return stream;
    }

    @Override
    public List<String> getComments() {
//        for(String x : comments) {
//            comments.get(x);
//        }
        return comments;
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        FacebookNews copy = (FacebookNews) super.clone();
        copy.title = this.title;
        copy.stream = this.stream;
        copy.comments = this.comments;
        return copy;
    }

    public void displayPost() {
        System.out.println("The facebook post is opening!");
    }
}
