package _00_Examene._01_Creationale.T02;

import _00_Examene._01_Creationale.T02.pb1_prototype.FacebookNews;
import _00_Examene._01_Creationale.T02.pb1_prototype.Live;

public class MainTest2 {
    public static void main(String[] args) {
        Live post1 = new FacebookNews("first post");

        Live post2;
        try {
            post2 = (FacebookNews) ((FacebookNews) post1).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        ((FacebookNews) post1).displayPost();
        post1.addComment("first comm");

        ((FacebookNews) post2).displayPost();
        post2.addComment("second comm");

        System.out.println(post1.getComments());
        System.out.println(post2.getComments());
    }
}
