package com.DhinesDeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find Triplets with Zero Sum (3Sum Problem)
public class program28 {
    private static List<List<Integer>> findTripletSum(int[] ar) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(ar); // Sort the array for two-pointer approach
        for (int i = 0; i < ar.length; i++) {
            if (i > 0 && ar[i] == ar[i - 1]) {
                continue; // Skip duplicate elements for the first element
            }
            int start = i + 1;
            int end = ar.length - 1;
            while (start < end) {
                int sum = ar[i] + ar[start] + ar[end];
                if (sum == 0) {
                    res.add(Arrays.asList(ar[i], ar[start], ar[end]));
                    start++;
                    end--;

                    // Skip duplicate elements for the second and third elements
                    while (start < end && ar[start] == ar[start - 1]) start++;
                    while (start < end && ar[end] == ar[end + 1]) end--;
                } else if (sum < 0) {
                    start++; // Move start forward for a larger sum
                } else {
                    end--; // Move end backward for a smaller sum
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = findTripletSum(ar);
        System.out.println("Triplets with zero sum: " + result);
    }
    //Triplets with zero sum: [[-1, -1, 2], [-1, 0, 1]]
}
