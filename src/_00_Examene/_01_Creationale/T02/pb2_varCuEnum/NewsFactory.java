package _00_Examene._01_Creationale.T02.pb2_varCuEnum;

public class NewsFactory implements AbstractNewsFactory {

    @Override
    public NewsArticle createNews(NewsType type, String title, String text) {
        if(type == NewsType.ECONOMY) {
            return new EconomyNews(title, text);
        } else if (type == NewsType.POLITICS) {
            return new PoliticsNews(title, text);
        } else if (type == NewsType.SPORTS) {
            return new SportsNews(title, text);
        } else return null;
    }
}
