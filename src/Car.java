public class Car {
  private int speed;
  private int acceleration;
  private int health;
  private int durability;
  private boolean gps;
  private int extra_style;
  private int comfort;

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

  public void setGps(boolean gps) {
    this.gps = gps;
  }

  public void setExtra_style(int extra_style) {
    this.extra_style = extra_style;
  }

  public void setcomfort(int comfort) {
    this.comfort = comfort;
  }

  public void displayStats() {
    String border = "==============================";
    System.out.println(border);
    System.out.println("Speed: " + speed);
    System.out.println("Acceleration: " + acceleration);
    System.out.println("Health: " + health);
    System.out.println("Durability: " + durability);
    if (gps) {
      System.out.println("GPS: Enabled");
    }
    if (extra_style > 0) {
      System.out.println("Extra style: " + extra_style);
    }
    if (comfort > 0) {
      System.out.println("Comfort: " + comfort);
    }
    System.out.println(border);
  }
}
