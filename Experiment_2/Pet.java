public class Pet {

    private String name;
    private String type;
    private String breed;
    private int age;

    public Pet(String name, String type, String breed, int age) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }


    public void displayInfo() {
        System.out.println("Pet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
    }
}