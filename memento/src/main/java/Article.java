public class Article {
    private int id;
    private String title;
    private String content;

    public Article(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createMemento() {
        return new ArticleMemento(id, title, content);
    }

    public void restore(ArticleMemento memento) {
        this.id = memento.getId();
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
