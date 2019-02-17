import java.util.Random;

public class U2 extends Rocket{

    //generate a random number to decide if the rocket fails
    private Random random = new Random();

    public U2() {
        super();
        cost = 120000000;
        weight = 18000;
        maxWeight = 29000;
        cargo =0;

    }

    @Override
    public boolean launch() {

        double flagExplosion = random.nextDouble();

        double chanceExplosion = 0.04*(cargo/8000.0);

        if(chanceExplosion >= flagExplosion){
            //the rocket exploded
            return false;
        }else{
            //the rocket was launched successfully!
            return true;
        }
    }

    @Override
    public boolean land() {

        double flagCrash = random.nextDouble();

        double chanceCrash = 0.08*(cargo/8000.0);

        if(chanceCrash >= flagCrash){
            //the rocket crashed
            return false;
        }else{
            //the rocket landed successfully!
            return true;
        }
    }
}
