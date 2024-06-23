//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car  = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("___");

        Car ferrari = new GasPoweredCar("2022 Blue Farrari 296 GTS",15.4,6);
        runRace(ferrari);
        System.out.println("___");

        Car tesla = new ElectricCar("2022 Red Tesla Model3", 568,75);
        runRace(tesla);
        System.out.println("___");

        Car ferrariHybrid = new HybridCar("2022 Black Farrari SF90 Stradale", 16,8,8);
        runRace(ferrariHybrid);
        System.out.println("___");
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}