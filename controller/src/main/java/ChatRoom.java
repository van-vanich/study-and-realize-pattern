import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom{

    private Map<String, User> userMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User user = userMap.get(userId);
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }
}
