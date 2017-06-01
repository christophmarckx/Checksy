package checksy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.mockito.InjectMocks;
import org.mockito.Mock;



/**
 * Created by chris on 1/06/2017.
 */
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;


    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void addUser_ShouldCallUserRepository() throws Exception {
        userRepository.addUser(new User(1l, "Christoph","Marckx","Niz","Doelhaagstraat", "60","Rumst","Belgium","0472258387"));
        verify(userRepository).addUser(new User(1l, "Christoph","Marckx","Niz","Doelhaagstraat", "60","Rumst","Belgium","0472258387"));
    }

//    @Test
//    public void getAllUsers() throws Exception {
//        User user1 = new User(1l, "Christoph","Marckx","Niz","Doelhaagstraat", "60","Rumst","Belgium","0472258387");
//        when(userRepository.getAllUsers()).thenReturn(Arrays.asList(user1));
//        assertThat(userService.getAllUsers()).contains(user1);
//    }


}