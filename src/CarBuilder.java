public interface CarBuilder {
    void setSpeed(int speed);
    void setAcceleration(int acceleration);
    void setHealth(int health);
    void setDurability(int durability);
    Car getResult();
  }