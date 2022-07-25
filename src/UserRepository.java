import java.util.List;

public interface UserRepository {

    void insert(User user);
    List<User> findAll();
    User findByEmailAndPassword(String email, String password);

}
