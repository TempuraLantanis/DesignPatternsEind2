public class Car {
    private String type;
    private int seats;

    //Stat points
    private int health;
    private int durability;
    private int speed;
    private int acceleration;

    public Car(
        //String naam, String engine, int seats, int health, int durability, int speed, int acceleration
        ){

    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public int getHealth(){
        return this.health;
    }

    public void setDurability(int newDurability){
        this.durability = newDurability;
    }

    public int getDurability(){
        return this.durability;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int setSpeed(){
        return this.speed;
    }

    public void setAcceleration(int newAcceleration){
        this.acceleration = newAcceleration;
    }

    public int getAcceleration(){
        return this.acceleration;
    }
}
