public class Cashier extends User {
    public Cashier(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(BagShop shop) {
        System.out.println("1. View Bags\n2. Search Bags\n3. Add Bag\n4. Exit");
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewBags(shop);
                    break;
                case 2:
                    System.out.println("Enter category:");
                    String category = scanner.next();
                    searchBags(shop, category);
                    break;
                case 3:
                    System.out.println("Enter bag details (id, name, category, price):");
                    int id = scanner.nextInt();
                    String name = scanner.next();
                    String cat = scanner.next();
                    double price = scanner.nextDouble();
                    Bag newBag = new Bag(id, name, cat, price);
                    addBag(shop, newBag);
                    System.out.println("Bag added.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
        menu(shop); // Recursive call to show the menu again after action
    }

    public void viewBags(BagShop shop) {
        for (Bag bag : shop.getBags()) {
            System.out.println(bag);
        }
    }

    public void addBag(BagShop shop, Bag bag) {
        shop.addBag(bag);
    }

    public void searchBags(BagShop shop, String category) {
        for (Bag bag : shop.getBags()) {
            if (bag.getCategory().equalsIgnoreCase(category)) {
                System.out.println(bag);
            }
        }
    }
}
