package PlasmaCannonEngines;

public class MagicMissile extends OffensiveMagic {


    @Override
    public void execute() {
        System.out.println("Cannon fires Magic Missile for "+ damage + " !");
        System.out.println("-"+mana+" Mana");


    }
}
