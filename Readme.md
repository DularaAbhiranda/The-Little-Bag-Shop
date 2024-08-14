# The Little Bag Shop

"The Little Bag Shop" is a simple console-based Java application designed to simulate a bag shop management system. It features two types of users, Manager and Cashier, each with distinct responsibilities and capabilities.

## System Overview

The system allows for various operations related to bag management and user interaction within a shop setting. Users can view, add, and search for bags based on different categories. Managers have the additional ability to create new cashier accounts, thus providing a more administrative role.

## Features

- **Login Authentication**: Users can log in as either a Manager or a Cashier.
- **Bag Management**: Users can add new bags, view all bags, and search for bags by category.
- **User Management**: Managers can create new Cashier accounts.

## User Roles

- **Manager**:
  - View all bags.
  - Add new bags to the system.
  - Search for bags by category.
  - Create new user accounts for Cashiers.

- **Cashier**:
  - View all bags.
  - Add new bags to the system.
  - Search for bags by category.

## Prerequisites

To run this application, you will need:
- Java JDK (Java Development Kit), version 8 or higher.

**Compile the Java files**:
Navigate to the source directory where the Java files are located, and compile them using the following command:
```bash
javac User.java 
javac Cashier.java 
javac Manager.java 
javac Bag.java 
javac BagShop.java 
javac Main.java

java Main


How to Use
Once you start the application, follow these steps:

Login:

Enter your username and password when prompted.
The system currently supports the following default accounts:
Manager: Username - admin, Password - adminpass
Cashier: Username - cashier, Password - cashpass
Choose an Operation:

Depending on your user role (Manager or Cashier), you will see a menu of available operations.
Select the operation by entering the corresponding number.
Follow Prompts:

The system will guide you through each operation with prompts. Follow them to view, add, or search for bags.
Managers will additionally be prompted for creating new cashier accounts when selecting that option.