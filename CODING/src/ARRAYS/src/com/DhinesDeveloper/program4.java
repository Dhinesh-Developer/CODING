package com.DhinesDeveloper;
// delete an element at the specfied pos
public class program4 {

    private static void deleteElementAtSpecifiedPos(int[] ar, int k) {
        int n = ar.length;
        
        // Shift elements to the left after deleting the element at position k
        for (int i = k - 1; i < n - 1; i++) {
            ar[i] = ar[i + 1];
        }
        
        // Print the array after deletion
        for (int i = 0; i < n - 1; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 5, 6};
        int k = 2; // Position to delete (2nd element)
        deleteElementAtSpecifiedPos(ar, k);
    }
}
