public class HybridCar extends Car{
    private double avgKmPerCharge;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }
    public HybridCar(String description, double avgKmPerCharge, int cylinders, int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up. %n", batterySize);
        System.out.printf("Hybrid -> switch %d kwh battery on, Ready!%n", batterySize);
    }
    @Override
    protected void runEngine(){
        System.out.printf("Hybrid -> usage below average: %.2f%n", avgKmPerCharge);
    }
}
