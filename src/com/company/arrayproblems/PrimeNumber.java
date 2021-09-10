package com.company.arrayproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = 20;
        System.out.print("1 ");


        for (int j = 2; j <= num; j++) {
            int counter = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(j + " ");
            }
        }
    }
}
