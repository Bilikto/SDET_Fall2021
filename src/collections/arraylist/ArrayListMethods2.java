package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        List<String> teslaModels = new ArrayList<>(Arrays.asList("Model 3", "Model X", "Model S", "Model Y"));

        System.out.println("Tesla cars " + teslaModels);

        //contains()
        boolean hasModelS = teslaModels.contains("Model S");
        System.out.println("Does teslaModels list contain Model S? " + (hasModelS ? "yes" : "no"));

        //isEmpty()
        boolean hasElements = teslaModels.isEmpty();
        System.out.println("Is teslaModels list empty? " + hasElements);

        //clear()
        teslaModels.clear();
        System.out.println("Is teslaModels list been deleted now? " + teslaModels.isEmpty());

        //equals()
        List<String> fordCars1 = new ArrayList<>(Arrays.asList("F 150", "Raptor", "Escape", "Fusion"));
        List<String> fordCars2 = new ArrayList<>(Arrays.asList("F 150", "Raptor", "Escape", "Fusion"));

        System.out.println("Do these list contains the same elements in the same order? " + fordCars1.equals(fordCars2));

        //remove(element name)
        //remove(index)
        boolean isRaptorRemoved = fordCars1.remove("Raptor");
        boolean isFiestaRemoved = fordCars1.remove("Fiesta");
        System.out.println("Has Raptor been removed from fordCars1? " + isRaptorRemoved);
        System.out.println("Has Fiesta been removed from fordCars1? " + isFiestaRemoved);


        String removedEscape = fordCars2.remove(2);
        System.out.println("The removed car from fordCars2 is: " + removedEscape);

        System.out.println("The fordCars after removing Escape: " + fordCars2);

        fordCars1.set(0, "F 250");
        System.out.println("After updating fordCars1 " + fordCars1);



    }





}
