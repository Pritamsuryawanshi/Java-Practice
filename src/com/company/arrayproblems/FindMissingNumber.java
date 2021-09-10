package com.company.arrayproblems;

public class FindMissingNumber {
    public static void main(String[] args) {
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int[] a = {4, 5, 7, 9};
        findMissingNumber.findGenericMissingNumber(a);
    }

    private void findGenericMissingNumber(int[] a) {
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println("temp = " + temp + " & i = " + i);
            if (temp != a[i]) {
                System.out.println(temp);
                i--;
            }
            temp++;
        }
    }

    /* private void findMissingNumber(int[] a) {
         for (int i = 1; i < a.length; i++) {
             if (i != a[i - 1]) {
                 System.out.println("missing number is " + i);
                 break;
             }
         }
     }
 */


}
