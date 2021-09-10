package com.company.arrayproblems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);//printing 0 and 1
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci(10);
        System.out.println();
        fibonacci.fibo(10);
    }

    static int n1 = 0, n2 = 1, n3 = 0;

    void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    void fibo(int size) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2);//printing 0 and 1
        for (int i = 0; i < size; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }

}
