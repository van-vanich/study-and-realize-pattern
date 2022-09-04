public class ObserverApplication {
    public static void main(String[] args) {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();

        MessagePublisher publisher = new MessagePublisher();

        publisher.attach(messageSubscriberOne);
        publisher.attach(messageSubscriberTwo);
        publisher.notifyUpdate(new Message("First message"));

        publisher.detach(messageSubscriberOne);
        publisher.attach(messageSubscriberThree);
        publisher.notifyUpdate(new Message("Second message"));

    }
}
