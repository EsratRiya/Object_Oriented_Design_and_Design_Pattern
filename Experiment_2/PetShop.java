import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private List<Pet> pets = new ArrayList<>();


    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " the " + pet.getType() + " (" + pet.getBreed() + ") has been added to the pet shop.");
    }


    public void sellPet(String petName) {
        Pet petToSell = findPetByName(petName);
        if (petToSell != null) {
            pets.remove(petToSell);
            System.out.println(petToSell.getName() + " the " + petToSell.getType() + " (" + petToSell.getBreed() + ") has been sold.");
        } else {
            System.out.println("Sorry, " + petName + " is not available in the shop.");
        }
    }


    public void feedPet(String petName) {
        Pet petToFeed = findPetByName(petName);
        if (petToFeed != null) {
            System.out.println(petToFeed.getName() + " the " + petToFeed.getType() + " (" + petToFeed.getBreed() + ") has been fed.");
        } else {
            System.out.println("Sorry, " + petName + " is not in the shop.");
        }
    }


    public void displayPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets available in the shop.");
            return;
        }
        System.out.println("\n--- Available Pets ---");
        for (Pet pet : pets) {
            pet.displayInfo();
            System.out.println("----------------------");
        }
    }

    
    private Pet findPetByName(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }
}