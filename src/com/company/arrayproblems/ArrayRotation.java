package com.company.arrayproblems;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        ArrayRotation.rotateArray(3, a);
    }

    public static void rotateArray(int noOfTimes, int[] a) {
        int temp = 0;
        for (int i = 0; i < noOfTimes; i++) {
            temp = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
