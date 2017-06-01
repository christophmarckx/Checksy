package checksy;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 21/05/2017.
 */
@Named
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
}
