public class Main {
    public static void main(String[] args) {
        BagShop shop = new BagShop();
        shop.addUser(new Manager("admin", "adminpass"));
        shop.addUser(new Cashier("cashier", "cashpass"));

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Enter username:");
            String username = scanner.next();
            System.out.println("Enter password:");
            String password = scanner.next();

            User user = shop.authenticateUser(username, password);
            if (user != null) {
                user.menu(shop);
            } else {
                System.out.println("Authentication failed.");
            }
        }
    }
}
