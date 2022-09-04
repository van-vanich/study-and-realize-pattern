public class ChatUser extends User {

    public ChatUser(IChatRoom mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(String message, String userId) {
        System.out.println(getName() + " send message: " + message);
        getMediator().sendMessage(message, userId);
    }

    @Override
    public void receive(String message) {
        System.out.println(getName() + " received message: " + message);
    }
}
