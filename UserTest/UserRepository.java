import java.util.*;

public class UserRepository {

    final private static Map<Integer, User> users = new HashMap<>();

    public synchronized void addUser(User user) {
        users.put(users.size() + 1, user);
    }

    public synchronized User getUser(int userID) {
        return users.get(userID);
    }

    public synchronized Map<Integer, User> getOrderedUser() {
        return new TreeMap<>(users);
    }
}