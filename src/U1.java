import java.util.Random;

public class U1 extends Rocket {

    //generate a random number to decide if the rocket fails
    private Random random = new Random();

    public U1() {
        super();
        cost = 100000000;
        weight = 10000;
        maxWeight = 18000;
        cargo =0;

    }

    @Override
    public boolean launch() {

        double flagExplosion = random.nextDouble();

        double chanceExplosion = 0.05*(cargo/8000.0);

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

        double chanceCrash = 0.01*(cargo/8000.0);

        if(chanceCrash >= flagCrash){
            //the rocket crashed
            return false;
        }else{
            //the rocket landed successfully!
            return true;
        }
    }
}
