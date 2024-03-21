public class Main {
    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public static void main(String[] args) {
        User user1 = getUser();
        System.out.println("user1: " + user1);
        User user2 = getUser();
        user2.setName("Mirò");
        user2.setAge("44");
        System.out.println("user2: " + user2);
    }
}