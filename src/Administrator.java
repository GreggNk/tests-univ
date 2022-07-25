public class Administrator extends User {
    public Administrator(String firstName, String lastName,
                         String email, String password) {
        super(firstName, lastName, email, password);
    }

    @Override
    public UserRole getRole() {
        return UserRole.ADMINISTRATOR;
    }

}
