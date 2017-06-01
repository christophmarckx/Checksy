package checksy;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by chris on 1/06/2017.
 */
public class UserService {

    @Inject
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
