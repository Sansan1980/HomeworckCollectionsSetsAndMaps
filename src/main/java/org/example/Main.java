package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(112, 111, 1, 1, 2, 3, 4, 4, 5, 6, 6, 7));
        //Задача 1
        printOddNambers(nums);

        //Задача 2
        Set<Integer> nums2 = new TreeSet<>(nums);
        printEvenNumbers(nums2);
        // Задача 4
        List<String> strings = new ArrayList<>(List.of("два", "два", "четыре", "три", "три", "три", "один","четыре" , "четыре", "четыре"));
        Map<String, Integer> map = new HashMap<>();

        for (String a : strings) {
            if (map.containsKey(a)) {
                map.merge(a, 1, Integer::sum);
                System.out.println(map + "||| " + a );
           } else {
                map.put(a, 1);
               System.out.println(map + "ZZZ " + a);
            }
        }
    }



/*

        Set<String> k = map.keySet();
        ArrayList<Integer> v = new ArrayList<>(map.values());
        System.out.println(k);
*/

       /* for (Map.Entry<String, Integer> entry : strings) {

            if (map.containsKey()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
            } else {
                map.put(a, 1);
                }*/
//  System.out.println(v);


    private static void printOddNambers(Collection<Integer> nambers) {
        for (Integer a : nambers) {
            if (a % 2 != 0) {
                System.out.print(a + ", ");
            }
        }
        System.out.println();
    }

    private static void printEvenNumbers(Collection<Integer> nambers) {
        for (Integer a : nambers) {
            if (a % 2 == 0) {
                System.out.print(a + ", ");
            }
        }
        System.out.println();
    }
//-//-//-//
}