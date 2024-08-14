import java.util.ArrayList;
import java.util.List;

public class BagShop {
    private List<Bag> bags = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBag(Bag bag) {
        bags.add(bag);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Bag> getBags() {
        return bags;
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                return user;
            }
        }
        return null;
    }
}
