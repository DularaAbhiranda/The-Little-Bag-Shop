public class Manager extends Cashier {
    public Manager(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(BagShop shop) {
        System.out.println("1. View Bags\n2. Search Bags\n3. Add Bag\n4. Create Cashier\n5. Exit");
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 4:
                    System.out.println("Enter new cashier details (username, password):");
                    String uname = scanner.next();
                    String pass = scanner.next();
                    createUser(shop, uname, pass);
                    System.out.println("New cashier created.");
                    break;
                default:
                    super.menu(shop); // Handles other options by calling the superclass method
            }
        }
    }

    public void createUser(BagShop shop, String username, String password) {
        Cashier newCashier = new Cashier(username, password);
        shop.addUser(newCashier);
    }
}
