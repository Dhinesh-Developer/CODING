package com.DhinesDeveloper;

import java.util.HashMap;

// Find all the duplicates in the array
public class program11 {
    private static void findAllDuplicates(int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element
        for (int i = 0; i < ar.length; i++) {
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }

        // Print elements with count > 1 (duplicates)
        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.print(k + " ");
            }
        });
    }

    public static void main(String[] args) {
        int[] ar = {2, 5, 3, 1, 8, 7, 5, 3, 2};
        findAllDuplicates(ar);
    }
    //2 3 5 
}
