package com.company.oops;

public class JavaOverloading {
    public static void main(String[] args) {
        JavaOverloading javaOverloading = new JavaOverloading();
        javaOverloading.callMethod(2, 2);
    }

    public int callMethod(int a, int b) {
        return a;
    }

    //IT WILL THROW AN ERROR IN COMPILE TIME NOT RUNTIME
   /* public void callMethod(int c, int d) {
        System.out.println(c);
    }*/
}
