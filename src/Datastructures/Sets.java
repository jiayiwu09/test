package Datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        //1.HashSet random order,
        //2. LinkedHashSet in order,
        // 3.TreeSet natural order

        Set<String> animals = new LinkedHashSet<String>();
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");

        System.out.println(animals.size() +"" +animals);

        animals.add("hog");
        animals.add("cat");
        animals.add("goose");
        System.out.println(animals.size() + "" +animals);// no duplicate

        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is:" +intersectionSet);

        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is:" +unionSet);

        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is:" + differenceSet);

    }
}
