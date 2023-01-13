public class SportsCarBuilder implements CarBuilder {
    //Implements another builder that builds a char object with their build functions
    //modified to demonstrate different builders

    private Car car;
  
    public SportsCarBuilder() {
      car = new Car();
      car.setGps(true); // Only Sports cars have gps
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


    public void buildCar(int speed, int acceleration, int health, int durability){ // implements a streamlined constructor for the car this can be modified depending on the builder desires
        setSpeed(speed);
        setAcceleration(acceleration);
        setHealth(health);
        setDurability(durability);
        getResult();

    }

  }