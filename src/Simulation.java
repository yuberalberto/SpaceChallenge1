import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems(File file){

        ArrayList<Item> listOfItems = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                Item item = new Item();
                String readedItem = fileScanner.nextLine();
                String[] splitItem = readedItem.split("=");
                String itemName=splitItem[0];
                int itemWeight= Integer.parseInt(splitItem[1]);

                item.setName(itemName);
                item.setWeight(itemWeight);

                listOfItems.add(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listOfItems;
    }

    ArrayList<U1> loadU1(ArrayList<Item> list){
        ArrayList<U1> listOfU1 = new ArrayList<>();
        int sizeList = list.size();

        for(int i=0; i<sizeList; i++){
            U1 newU1 = new U1();
            while(newU1.canCarry(list.get(i))){
                newU1.carry(list.get(i));
            }
            listOfU1.add(newU1);
        }

        return listOfU1;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> list){
        ArrayList<U2> listOfU2 = new ArrayList<>();

        for(int i=0; i<list.size(); i++){
            U2 newU2 = new U2();
            while(newU2.canCarry(list.get(i))){
                newU2.carry(list.get(i));
            }
            listOfU2.add(newU2);
        }

        return listOfU2;
    }

    int runSimulation(ArrayList<U1> rockets) {

        int budget = 0;

        for (U1 rocket : rockets) {

            while(rocket.land() || rocket.launch()){
            rocket.launch();
            rocket.land();
            }
            budget += rocket.cost;
        }

        return budget;

    }

}
