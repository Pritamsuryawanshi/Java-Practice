package com.company.arrayproblems;

import java.util.Objects;

public class CompareToExample3 {
    // main method
    public static void main(String args[]) {

// input string in uppercase  
        String st1 = new String("INDIA IS MY COUNTRY");

// input string in lowercase  
        String st2 = new String("india is my country");

       // System.out.println(st1.compareTo(st2));
        CompareToExample3 compareToExample3 = new CompareToExample3();
        compareToExample3.elseIfCheck("B");
    }

    public void elseIfCheck(String str) {
        switch (str) {
            case "A":
                System.out.println("Good morning.");
                break;
            case "B":
                System.out.println("Good day.");
                break;
            case "C":
                System.out.println("Good evening.");
                break;
        }
    }
}  