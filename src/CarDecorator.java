public abstract class CarDecorator extends Car {
  protected Car decoratedCar;

  public CarDecorator(Car decoratedCar) {
    this.decoratedCar = decoratedCar;
  }

  @Override
  public void setSpeed(int speed) {
    decoratedCar.setSpeed(speed);
  }

  @Override
  public void setAcceleration(int acceleration) {
    decoratedCar.setAcceleration(acceleration);
  }

  @Override
  public void setHealth(int health) {
    decoratedCar.setHealth(health);
  }

  @Override
  public void setDurability(int durability) {
    decoratedCar.setDurability(durability);
  }

  public void updateStyle(int style){
    decoratedCar.setExtra_style(style);
  }

  public void updateComfort(int comfort){
    decoratedCar.setcomfort(comfort);
  }

  @Override
  public void displayStats() {
    decoratedCar.displayStats();
  }
}