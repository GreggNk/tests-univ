import java.io.Serializable;

public class Student extends User {

    private long albumNumber;

    public Student(String firstName, String lastName,
                   String email, String password, long albumNumber) {
        super(firstName, lastName, email, password);
        this.albumNumber = albumNumber;
    }

    @Override
    public UserRole getRole() {
        return UserRole.STUDENT;
    }
}
