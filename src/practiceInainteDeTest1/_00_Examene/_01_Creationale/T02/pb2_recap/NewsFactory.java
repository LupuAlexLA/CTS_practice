package practiceInainteDeTest1._00_Examene._01_Creationale.T02.pb2_recap;

public class NewsFactory implements AbstractNewsFactory {

    @Override
    public NewsArticle createNews(NewsType type, String title, String text) {
        if(type == NewsType.ECONOMICS) {
            return new EconomicsNews(title, text);
        } else if(type == NewsType.POLITICS) {
            return new PoliticsNews(type, title, text);
        } else if (type == NewsType.SPORTS) {
            return new SportsNews(title, text);
        } else {
            return null;
        }
    }
}
