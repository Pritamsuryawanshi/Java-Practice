package com.company.arrayproblems;

public class DontPrintDuplicates {
    public static void main(String[] args) {
        DontPrintDuplicates dontPrintDuplicates = new DontPrintDuplicates();
        dontPrintDuplicates.dontPrintDuplicates();
    }

    private void dontPrintDuplicates() {
        int found = 0;
        String[] a = {"pritam", "saili", "rupak", "pritam", "geeta", "jay", "john", "rupak"};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
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
