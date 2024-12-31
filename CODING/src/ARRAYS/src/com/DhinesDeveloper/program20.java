package com.DhinesDeveloper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class program20 {
    // Function to return k most frequent elements
    private static List<Integer> kMostFrequent(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        // Count frequencies
        for (int num : ar) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        // Create buckets based on frequency
        List<Integer>[] bucket = new ArrayList[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int num : map.keySet()) {
            int freq = map.get(num);
            bucket[freq].add(num);
        }

        // Collect k most frequent elements
        List<Integer> result = new ArrayList<>();
        for (int i = maxFreq; i > 0 && result.size() < k; i--) {
            if (!bucket[i].isEmpty()) {
                result.addAll(bucket[i]);
            }
        }

        // Trim to exactly k elements if needed
        return result.subList(0, k);
    }

    public static void main(String[] args) {
        int[] ar = {1, 1, 1, 2, 2, 3, 3, 3};
        int k = 2; // Get the top 2 most frequent elements
        List<Integer> result = kMostFrequent(ar, k);
        System.out.println("Top " + k + " most frequent elements: " + result);
    }
}
