public class ArticleMemento {
    private final int id;
    private final String title;
    private final String content;

    public ArticleMemento(int id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
