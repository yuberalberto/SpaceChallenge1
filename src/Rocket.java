public class Rocket implements SpaceShip{
    int cost;
    int weight;
    int maxWeight;
    int cargo;
//    double chanceExplosion;
//    double chanceCrash;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {

        if(weight+cargo+item.getWeight() > maxWeight){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void carry(Item item) {

        if(this.canCarry(item)){
            cargo += item.getWeight();
        }
    }
}
