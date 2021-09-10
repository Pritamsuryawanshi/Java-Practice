package com.company.arrayproblems;

public class PairOfSum {
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 6, 7, 5, 4, 7, 99, 1, 3, 5};
        int find = 10;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == find)
                        System.out.println("Trio is " + a[i] + " and " + a[j] + " and " + a[k]);
                }

            }
        }
    }
}
