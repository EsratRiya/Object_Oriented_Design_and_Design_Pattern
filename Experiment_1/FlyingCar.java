// Create a class that implements both interfaces

public class FlyingCar implements Vehicle, FlyingObject {
    
    private String name;

    public FlyingCar(String name) {
        this.name = name;
    }

    // Implement methods from the Vehicle interface
    @Override
    public void drive() {
        System.out.println(name + " is driving on the road.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    // Implement methods from the FlyingObject interface
    @Override
    public void takeOff() {
        System.out.println(name + " is taking off.");
    }

    @Override
    public void land() {
        System.out.println(name + " has landed.");
    }
}
