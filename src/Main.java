import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Simulation simPhase1 = new Simulation();
        Simulation simPhase2 = new Simulation();

        File phase1 = new File("phase-1.txt");
        File phase2 = new File("phase-2.txt");

        ArrayList<Item> itemsLoaded = simPhase1.loadItems(phase1);
        ArrayList<U1> U1Loaded = simPhase1.loadU1(itemsLoaded);
        int results = simPhase1.runSimulation(U1Loaded);

        System.out.println("The total budged for U1 would be => $" + results);

    }

}
