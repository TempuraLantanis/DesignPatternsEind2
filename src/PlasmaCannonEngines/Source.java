package PlasmaCannonEngines;
import java.util.Random;
import static java.lang.Math.abs;


public class Source { // The source provides aether from which all spiritual beings bind to in its material plane
    int seed =1231145;
    Random randomGen = new Random(seed);

    Source(int s){
    this.seed = s;
    }

    public int extractMana(){
        System.out.println("Weaving from the ethereal planes");
        return abs(randomGen.nextInt());
    }


}
