public abstract class User {
    private IChatRoom mediator;

    private String id;
    private String name;

    public User(IChatRoom mediator, String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }

    public abstract void send(String message, String userId);
    public abstract void receive(String message);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
