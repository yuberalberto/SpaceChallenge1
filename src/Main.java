import java.io.File;

public class Main {

    public static void main(String[] args){

        Simulation simPhase1 = new Simulation();
        Simulation simPhase2 = new Simulation();

        File phase1 = new File("/home/beto/IdeaProjects/SpaceChallenge1/src/phase-1.txt");
        File phase2 = new File("/home/beto/IdeaProjects/SpaceChallenge1/src/phase-2.txt");

        System.out.println(simPhase1.runSimulation(simPhase1.loadU1(simPhase1.loadItems(phase1))));


    }

}
