import java.util.ArrayList;
import java.util.List;

public class ExampleUserRepository implements UserRepository {

    private List<User> memory;

    public ExampleUserRepository() {
        memory = new ArrayList<>();
        memory.add(new Student("Andrzej", "Bobowski",
                "janek342@gmail.com", "Jan@13", 344421L));
        memory.add(new Teacher("Aldona", "Kowalska",
                "kowalska@gmail.com", "malg@onE", "mgr"));
    }

    @Override
    public void insert(User user) {
        memory.add(user);
    }

    @Override
    public List<User> findAll() {
        return memory;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        List<User> users = findAll();
        for (User user: users) {
            if (user.getEmail().equalsIgnoreCase(email)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}
