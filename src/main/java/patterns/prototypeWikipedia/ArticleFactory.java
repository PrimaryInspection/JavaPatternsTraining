package patterns.prototypeWikipedia;

public class ArticleFactory {
    Article article;

    public ArticleFactory(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public void setPrototype(Article article) {
        this.article = article;
    }

    Article makeCopy(){
        return (Article) article.copy();
    }
}
