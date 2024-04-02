package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_recap;

public interface AbstractNewsFactory {
    NewsArticle createNews(NewsType type, String title, String text);
}
