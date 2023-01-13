package PlasmaCannonEngines;
import java.util.Random;



public class Source { // The source provides aether from which all spiritual beings bind to in its material plane
    int seed;
    Random randomGen = new Random(seed);


    public int extractMana(){
        System.out.println("Weaving from the ethereal planes");
        return randomGen.nextInt();
    }


}
