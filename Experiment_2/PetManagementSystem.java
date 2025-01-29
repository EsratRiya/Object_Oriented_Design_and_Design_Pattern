import java.util.Scanner;

public class PetManagementSystem {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        PetShop petShop = new PetShop();

        Pet dog = new Pet("Dollar", "Dog", "German", 3);
        Pet cat = new Pet("Euro", "Cat", "Persian", 2);

        petShop.addPet(dog);
        petShop.addPet(cat);

        while (true) {

            System.out.println("\n=== PET MANAGEMENT SYSTEM ===");

            System.out.println("1. Add Pet");
            System.out.println("2. View Pets");
            System.out.println("3. Sell Pet");
            System.out.println("4. Feed Pet 🍖");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {

                case 1:
                    System.out.print("Enter pet name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter pet type: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter pet breed: ");
                    String breed = scanner.nextLine();

                    System.out.print("Enter pet age: ");
                    int age = scanner.nextInt();

                    scanner.nextLine();

                    petShop.addPet(new Pet(name, type, breed, age));
                    break;

                case 2:
                    petShop.displayPets();
                    break;

                case 3:
                    System.out.print("Enter pet name to sell: ");
                    String sellName = scanner.nextLine();

                    petShop.sellPet(sellName);
                    break;

                case 4:
                    System.out.print("Enter pet name to feed: ");
                    String feedName = scanner.nextLine();

                    petShop.feedPet(feedName);
                    break;

                case 5:
                    System.out.println("Exiting Pet Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
