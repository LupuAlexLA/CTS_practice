package _00_Examene._01_Creationale.T02.pb2_varCuEnum;

public interface AbstractNewsFactory {
    NewsArticle createNews(NewsType type, String title, String text);
}
