import java.util.Scanner;

public class AdministratorMenuView extends SystemMenuView {

    private UserRepository userRepository;

    public AdministratorMenuView(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    protected void initialize() {
        AdministratorMenuItem[] items = AdministratorMenuItem.values();
        for (AdministratorMenuItem item : items) {
            System.out.println(item.getNr() + " - " + item.getTranslated());
        }
        System.out.println("Twój wybór: ");
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        AdministratorMenuItem menuItem = AdministratorMenuItem.ofNr(nr);
        switch (menuItem) {
            case USER_LIST:
                UserListView userListView = new UserListView(userRepository);
                userListView.run();
                run();
                break;
        }
    }

    @Override
    protected String getTitle() {
        return "MENU ADMINISTRATORA";
    }

}
