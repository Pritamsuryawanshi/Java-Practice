package com.company.arrayproblems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.print();
    }

    public void print() {
        int found = 0;
        String[] a = {"pritam", "saili", "rupak", "pritam", "geeta", "jay", "john", "rupak","rakesh"};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    found++;
                    break;
                }
            }
            if (found == 0) {
                System.out.println(a[i]);
            }
            if (found > 0)
                found--;
        }
    }
}
