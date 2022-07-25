public class Runner {

    public static void main(String[] args) {
//        testFile();
        UserRepository userRepository = new FileUserRepository();
        LoginForm loginForm = new LoginForm(userRepository);
        loginForm.run();
    }

    private static void testFile() {
        Student student1 = new Student("Jan", "Bobowski",
                "janek342@gmail.com", "Jan@13", 344421L);
        Teacher teacher1 = new Teacher("Małgorzata", "Kowalska",
                "kowalska@gmail.com", "malg@onE", "mgr");
        Administrator administrator1 = new Administrator("Witold", "Kowalski",
                "witek35@gmail.com", "Qwert@e9x3");
        Administrator administrator2 = new Administrator("Witold", "Bobowski",
                "witek35@gmail.com", "Qwert@e9x3");

        UserRole role1 = UserRole.STUDENT;
        UserRole role2 = UserRole.TEACHER;
        UserRole role3 = UserRole.ADMINISTRATOR;

        FileUserRepository fileUserRepository = new FileUserRepository();
        fileUserRepository.insert(student1);
        fileUserRepository.insert(teacher1);
        fileUserRepository.insert(administrator1);
        fileUserRepository.insert(administrator2);
        System.out.println(fileUserRepository.findAll());
    }

}
