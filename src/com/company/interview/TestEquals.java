package com.company.interview;

public class TestEquals {

    public static void main(String[] args) {
        TestEquals testEquals = new TestEquals();
        ///  System.out.println("obj " + testEquals.toString());
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s4 = "HEY";
        String s3 = new String("HELLO");
        String s5 = new String("HELLO");
        System.out.println(s3 == s5);//false
        System.out.println(s1.equals(s5));//false


        //  System.out.println(s1 == s2); // true
      /*  System.out.println("test one " + (s1 == s4)); // false
        System.out.println("test two " + (s1.equals(s4))); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true*/
    }
}

//NewInstanceExample obj= NewInstanceExample.class.newInstance();
//T newInstance(Objects...initargs)


//Constructor<NewInstanceExample1> obj =NewInstanceExample1.class.getConstructor();
//NewInstanceExample1 obj1 = obj.newInstance();
