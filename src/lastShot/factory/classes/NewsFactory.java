package lastShot.factory.classes;

public class NewsFactory implements AbstractFactory {
    @Override
    public NewsArticle createArticle(NewsType type, String title, String text) {
        if(type == NewsType.ECONOMIE) {
            return new Economie(title, text);
        } else if (type == NewsType.POLITICA) {
            return new Politica(title, text);
        } else if (type == NewsType.SPORT) {
            return new Sport(title, text);
        } else {
            return null;
        }
    }
}
