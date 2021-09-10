package com.company.arrayproblems;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int[] a = {4, 2, 4, 6, 7, 5, 4, 4, 7, 99, 1, 3, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
            if (a[i] < smallest)
                smallest = a[i];
        }
        System.out.println("smallest = " + smallest + " largest = " + largest);
    }
}
