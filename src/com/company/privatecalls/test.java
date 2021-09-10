package com.company.privatecalls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Base obj = new Derived();
        obj.display();
        obj.print();

        //private call

        Class c = Class.forName("com.company.privatecalls.Derived");
        Object obj1 = c.newInstance();
        Method method = c.getDeclaredMethod("display2", null);
        method.setAccessible(true);
        method.invoke(obj, null);
    }
}