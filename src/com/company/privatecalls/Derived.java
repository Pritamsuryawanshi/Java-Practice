package com.company.privatecalls;

class Derived extends Base {
    public void display() {
        System.out.println("Static or class method from Derived");
    }

    public void print() {
        System.out.println("Non-static or instance method from Derived");
    }

    public void display2() {
        System.out.println("private called with param +");
    }

}