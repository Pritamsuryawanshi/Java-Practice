package com.company.arrayproblems;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 3, 4, 5};
        boolean flag = false;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < a.length ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.println("a[i] = " + a[i] + " a[j] =" + a[j]);
                if (a[i] == a[j]) {
                    flag = true;
                    System.out.println("found");
                    //  integers.add(a[i]);
                    break;
                }
            }

            if (flag == false) {
                System.out.println("add");
                integers.add(a[i]);
            }

            if (flag==true) {
                flag = false;
            }
        }
        System.out.println(integers);
    }
}
