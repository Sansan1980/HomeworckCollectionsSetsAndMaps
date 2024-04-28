package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("//Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(112, 111, 1, 1, 2, 3, 4, 4, 5, 6, 6, 7));
        printOddNambers(nums);

        System.out.println("//Задача 2");
        Set<Integer> nums2 = new TreeSet<>(nums);
        printEvenNumbers(nums2);

        System.out.println("//Задача 3");
        List<String> strings = new ArrayList<>(List.of("два", "два", "четыре", "три", "три", "три", "один", "четыре", "четыре", "четыре"));
        uniqueValues(strings);

        System.out.println("// Задача 4");
        numberOfDuplicates(strings);

    }

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

    private static void numberOfDuplicates(List<String> strings) {
        Map<String, Integer> duplicate = new HashMap<>();
        for (String a : strings) {
            if (duplicate.containsKey(a)) {
                duplicate.merge(a, 1, Integer::sum);
            } else {
                duplicate.put(a, 1);
            }
        }
        System.out.println(duplicate.values());
        System.out.println(duplicate);
    }

    private static void uniqueValues(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String a : strings) {
            if (map.containsKey(a)) {
                ;
            } else {
                map.put(a, 1);
            }
        }
        System.out.println(map.keySet());
//-//-//-//
    }
}