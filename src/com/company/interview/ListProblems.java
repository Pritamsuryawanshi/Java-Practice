package com.company.interview;

import com.company.arrayproblems.PropertyClass;

import java.util.ArrayList;

public class ListProblems {
    public static void main(String[] args) {
        ArrayList<PropertyClass> lists = new ArrayList<>();
        PropertyClass propertyClass = new PropertyClass(1);
        PropertyClass propertyClass1 = new PropertyClass(2);
        PropertyClass propertyClass2 = new PropertyClass(3);
        lists.add(propertyClass);
        lists.add(propertyClass1);
        lists.add(propertyClass2);
        for (PropertyClass object : lists) {
            object.a = 1;
        }
        for (PropertyClass object : lists) {
            System.out.println(object);
        }
    }
}
