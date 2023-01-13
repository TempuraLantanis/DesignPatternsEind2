package PlasmaCannonEngines;

public class AetherCore {
    int mana;
    String message = " The Aetherial energies of the Aethercore is radiating from the core";

    AetherCore(int mana){
        this.mana = mana;


    }

    void execute(){
        System.out.println("Loading AetherCore");
        System.out.println("Aether loaded");


    }

    void useMana(int manaUse){
        mana -= manaUse;
        System.out.println("Consumed" + mana+ " mana!");

    }

    void addMana(int manaAdd){
        mana += manaAdd;
        System.out.println("Gained " + manaAdd + " mana!");
    }

    void inspect(){
        if(mana>20){
            System.out.println(message);
        }
        else{
            System.out.println("The core is looking dry");

        }


    }




}
