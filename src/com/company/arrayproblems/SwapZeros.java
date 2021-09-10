package com.company.arrayproblems;

public class SwapZeros {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 2, 0, 4, 3, 0, 0, 5, 0};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && !flag) {
                System.out.println("first " + i);
                flag = true;
                continue;
            }
            if (a[i] == 0 && !flag) {
                System.out.println("second " + i);
                continue;
            }
            if (flag && a[i] == 0) {
                System.out.println("i at 0 " + i);
                for (int j = i; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("arrray at " + i + " is " + a[i]);
        }
    }
}
