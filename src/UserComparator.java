import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int i = o1.getLastName().compareTo(o2.getLastName());
        if (i == 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return i;
        }
    }

}
