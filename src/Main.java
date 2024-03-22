public class Main {


    public static void main(String[] args) {
        User user1 = User.istance();
        System.out.println("user1: " + user1);
        User user2 = User.istance();
        user2.setName("Mirò");
        user2.setAge("44");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}