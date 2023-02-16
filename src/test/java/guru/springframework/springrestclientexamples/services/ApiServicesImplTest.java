package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServicesImplTest extends TestCase {
@Autowired
ApiService apiService;
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetUser() {
       List<User> users=apiService.getUsers(7);
       assertEquals(1,users.size());

    }
}