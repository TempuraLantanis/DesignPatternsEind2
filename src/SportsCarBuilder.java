public class SportsCarBuilder implements CarBuilder {
    private Car car;
  
    public SportsCarBuilder() {
      car = new Car();
    }
  
    
    public void setSpeed(int speed) {
      car.setSpeed(speed * 2); // Sports cars have twice the speed
    }
  
    
    public void setAcceleration(int acceleration) {
      car.setAcceleration(acceleration * 2); // Sports cars have twice the acceleration
    }
  
    
    public void setHealth(int health) {
      car.setHealth(health / 2); // Sports cars have half the health
    }
  
    
    public void setDurability(int durability) {
      car.setDurability(durability);
    }
  
    
    public Car getResult() {
      return car;
    }
  }