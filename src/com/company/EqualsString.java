package com.company;
import java.util.Scanner;

public class EqualsString {

    public static void main(String[] args) {
        EqualsString equalsString = new EqualsString();
        //  equalsString.gamblerSimulation();
        /*String str1 = new String("hello");
        String str2 = "hello";
        char ch = 'a';
        int a = ch;

        System.out.println(a);
        System.out.println(str1 == str2);
        String str3 = str1.intern();*/
        // EqualsString.nthHarmonic(8);
        int length1 = equalsString.findLength(2, 4, 5, 6);
    }

    public int findLength(int x1, int x2, int y1, int y2) {
        return 2;
    }

    public void gamblerSimulation() {
        int capital = 100;
        int won = 0;
        int bet = 0;
        while (true) {
            long round = Math.round(Math.random());
            System.out.println(round);
            if (round == 1) {
                capital++;
                bet++;
                won++;
                if (capital == 200) {
                    System.out.println("result : won bets : " + bet + " won : " + won + " capital : " + capital);
                    break;
                }
                continue;
            }
            capital--;
            bet++;
            if (capital == 0) {
                System.out.println("result : loss bets : " + bet + " won : " + won + " capital : " + capital);
                break;
            }
        }
    }

    public void findMagicNumber() {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = scanner.nextInt();
        int i = 100;
        while (true) {
            System.out.println("press 1 if your number is less than " + i / 2 + " or 0 if it greater than " + i / 2);
            int isit = scanner.nextInt();
            int oldValue = i;
            if (isit == 1) {
                i = i / 2;
                System.out.println("greater " + i);
            } else {
                i = oldValue - (i / 2);
                i = i / 2;
                i = oldValue - i;
                System.out.println("less " + i);
            }
        }
    }

    public void primeFactor() {
        int prime = 228;
        for (int i = 2; i <= prime; i++) {
            if (prime % i == 0) {
                System.out.print(i + " ");
                prime = prime / i;
                i--;
            }
        }
    }

    public void power() {
        System.out.println("enter the number :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;
        for (i = 2; i <= a; i = i + 2) {

        }
        System.out.println("power is " + i);
    }

    public void harmonic() {
       /* System.out.println("enter the harm :");
        Scanner scanner = new Scanner(System.in);*/
        //float a = scanner.nextFloat();
        float d = 1;
        int a = 8;
        for (float i = 2; i <= a; i++) {
            System.out.println("d " + d + " i " + i);
            d += 1 / i;
        }
        System.out.println("harm is " + d);
    }
/*
    static double nthHarmonic(int N) {
        // H1 = 1
        float harmonic = 1;
        // loop to apply the forumula
        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 2; i <= N; i++) {
            harmonic += (float) 1 / i;
        }
        System.out.println(harmonic);
        return harmonic;
    }*/


}
