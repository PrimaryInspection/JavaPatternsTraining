package patterns.prototypeWikipedia;

public class Article implements Copyable{

    String title;

    String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Article copy = new Article(title,text);

        return copy;
    }
}
