public class ControllerApplication {
    public static void main(String[] args) {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom,"1", "Ivan");
        User user2 = new ChatUser(chatroom,"2", "Vova");
        User user3 = new ChatUser(chatroom,"3", "Dima");
        User user4 = new ChatUser(chatroom,"4", "Anton");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello guys", "2");
        user2.send("pls send homework", "1");
    }
}
