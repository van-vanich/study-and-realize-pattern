public class MessageSubscriberOne implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberOne:" + message.getMessageContent());
    }
}
