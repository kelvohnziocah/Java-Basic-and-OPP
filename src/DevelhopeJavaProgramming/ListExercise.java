package DevelhopeJavaProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ListExercise {
    public static void main(String[] args){
        List <String> cityNames = Arrays.asList("Nairobi", "Mombasa", "Nakuru");
        //cityNames.add("Naivasha"); you can't any element to nonmutable array
        cityNames.set(1, "Tegucigalpa");
        for(String cityName: cityNames){
            System.out.println(cityName);
        }
        System.out.println("Kings of Rome are: ");
        List <String> kingsofRome = new ArrayList<>();
        kingsofRome.add("Romulus");
        kingsofRome.add("Numa Pompilius");
        kingsofRome.add("Tullus Hostilius");
        kingsofRome.add("Ancus Marcius");
        kingsofRome.add("Tarquinius Priscus");
        kingsofRome.add("Servius Tullius");
        kingsofRome.add("Tarquinius Superbus");
        for(String kingsofRomes: kingsofRome){
            System.out.println(kingsofRomes);
        }
        System.out.println("kings of Rome Array starts here:");
        String[] kingsOfRomeArray = kingsofRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        for (String kingsOfRomeArrays: kingsOfRomeArray){
            System.out.println(kingsOfRomeArrays);
        }
    }
}
