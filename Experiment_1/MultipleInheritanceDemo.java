public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Create a FlyingCar object
        FlyingCar myFlyingCar = new FlyingCar("SkyRider");

        // Demonstrate the capabilities
        System.out.println("Demonstrating the FlyingCar functionality:");
        myFlyingCar.drive();
        myFlyingCar.stop();
        myFlyingCar.takeOff();
        myFlyingCar.land();
    }
}
