public class Car {
    private int speed;
    private int acceleration;
    private int health;
    private int durability;
  
    public void setSpeed(int speed) {
      this.speed = speed;
    }
  
    public void setAcceleration(int acceleration) {
      this.acceleration = acceleration;
    }
  
    public void setHealth(int health) {
      this.health = health;
    }
  
    public void setDurability(int durability) {
      this.durability = durability;
    }

    public void displayStats() {
        String border = "==============================";
        System.out.println(border);
        System.out.println("Speed: " + speed);
        System.out.println("Acceleration: " + acceleration);
        System.out.println("Health: " + health);
        System.out.println("Durability: " + durability);
        System.out.println(border);
      }
  }