import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    // TODO: Define a PrintArrayList method that prints an ArrayList of plant (or
    // flower) objects
    public static void PrintArrayList(ArrayList<Plant> objList) {
        for (Plant p : objList)
        {
            if (p instanceof Flower)
            {
                p.printInfo();
            } else
            {
                p.printInfo();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();        

        input = scnr.next();
        while (!input.equals("-1")) {
            // Create objects
            Plant plant = new Plant();
            Flower flower = new Flower();
            // TODO: Check if input is a plant or flower
            // Store as a plant object or flower object
            if (input.equals("plant"))
            {
                plant.setPlantName(scnr.next());
                plant.setPlantCost(scnr.next());
                // Add to the ArrayList myGarden
                myGarden.add(plant);
            } else if (input.equals("flower"))
            {
                flower.setPlantName(scnr.next());
                flower.setPlantCost(scnr.next());
                boolean bool = Boolean.parseBoolean(scnr.next()); // this seems stupid..
                flower.setPlantType(bool); //needs looking into
                flower.setColorOfFlowers(scnr.next());
                // Add to the ArrayList myGarden
                myGarden.add(flower);
            }
            input = scnr.next();
        }
        scnr.close();
        // TODO: Call the method PrintArrayList to print myGarden
        PrintArrayList(myGarden);
    }
}
