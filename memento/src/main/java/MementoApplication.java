public class MementoApplication {
    public static void main(String[] args) {
        Article article = new Article(1, "article");
        article.setContent("hello!");
        System.out.println(article);

        ArticleMemento memento = article.createMemento();

        article.setContent("bye!");
        System.out.println(article);

        article.restore(memento);
        System.out.println(article);
    }

}
