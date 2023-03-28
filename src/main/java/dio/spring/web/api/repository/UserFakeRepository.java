package dio.spring.web.api.repository;

import dio.spring.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserFakeRepository {
    public List<User> findAll() {
        return new ArrayList<>(Arrays.asList(
                new User("user_a", ""),
                new User("user_b", "")
        ));
    }

}
