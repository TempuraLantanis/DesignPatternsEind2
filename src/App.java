public class App {
    public static void main(String[] args) {
        CarBuilder builder;
    
        // Build a sports car
        builder = new SportsCarBuilder();
        builder.setSpeed(100);
        builder.setAcceleration(80);
        builder.setHealth(50);
        builder.setDurability(30);
        Car sportsCar = builder.getResult();
        sportsCar.displayStats();
    
        // Build an off-road car
        builder = new OffRoadCarBuilder();
        builder.setSpeed(60);
        builder.setAcceleration(40);
        builder.setHealth(50);
        builder.setDurability(30);
        Car offRoadCar = builder.getResult();
        offRoadCar.displayStats();
    }
}
