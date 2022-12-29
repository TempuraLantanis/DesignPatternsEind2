public class OffRoadCarBuilder implements CarBuilder {
    private Car car;
  
    public OffRoadCarBuilder() {
      car = new Car();
    }
  
    
    public void setSpeed(int speed) {
      car.setSpeed(speed / 2); // Off-road cars have half the speed
    }
  
    
    public void setAcceleration(int acceleration) {
      car.setAcceleration(acceleration);
    }
  
    
    public void setHealth(int health) {
      car.setHealth(health * 2); // Off-road cars have twice the health
    }
  
    
    public void setDurability(int durability) {
      car.setDurability(durability * 2); // Off-road cars have twice the durability
    }
  
    
    public Car getResult() {
      return car;
    }
  }
  
  