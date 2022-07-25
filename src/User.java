import java.io.Serializable;

public abstract class User implements Serializable {

    private String firstName;
    private String lastName;

    private String email;
    private String password;

    public User(String firstName, String lastName,
                String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public abstract UserRole getRole();

    @Override
    public String toString() {
        return firstName+" "+lastName+" ("+email+")\n" +
                "Funkcja: "+getRole().getTranslated();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
