package com.company.arrayproblems;

public class PropertyClass {
    public int a;

    public PropertyClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "PropertyClass{" +
                "a=" + a +
                '}';
    }
}
