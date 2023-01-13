package PlasmaCannonEngines;


import java.util.ArrayList;

public class Facade {
    MagicMissile missileSpell = new MagicMissile();
    AetherCore BetelGuese = new AetherCore(300);
    Source aetherFountain = new Source();

    public void fireCannon(String spell) {
        if(spell == "Magic Missile"){
            BetelGuese.execute();
            missileSpell.execute();
            BetelGuese.useMana(missileSpell.mana);
            BetelGuese.addMana(aetherFountain.extractMana());
            System.out.println("Spell fired succesfully");

        }
        else
        {
            System.out.println("Spell doesn't exist");

        }




    }





}
