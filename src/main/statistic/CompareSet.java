package main.statistic;

import java.util.HashSet;
import java.util.Set;

public class CompareSet {

    public static void calculateAnimal(Set<String> set) {
        Set<String> paars = new HashSet<>();

        for (String str1 : set) {
            String prefix = str1.substring(0, 4);
            if (!paars.contains(prefix)) {
                int count = 0;
                for (String str2 : set) {
                    if (str2.substring(0, 4).equals(prefix)) {
                        count++;
                    }
                }
                paars.add(prefix);
                System.out.println(str1.replaceAll("\\d","") + " = " + count);
            }
        }
    }
}