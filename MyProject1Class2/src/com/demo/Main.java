package com.demo;

import java.io.OutputStream;
// Importing  a class  ArrayList
import java.util.ArrayList;//(c) indicates class and (i) indicates interface
class TestingGenerics<T>{ // this <> symbol indicates this class is  a generic class
         //there will be a wrapper class involved every time when this class will be generated or object for this class will generate
          //here T tells the type of wrapper class instead of T we can write anything inside <>
    T obj;
    //constructor
    TestingGenerics(T obj){ //if there is an object then create  a constructor
        this.obj =obj;
    }
    //create a method
    public T getObject(){ //here T is  the return type
        return this.obj;
    }
}
public class Main {

    public static void main(String[] args) {
        TestingGenerics<Integer> obj7= new TestingGenerics<>(100);
        System.out.println(obj7.getObject());//100 here we used object.functionname

        TestingGenerics<String> obj8= new TestingGenerics<>("Java");
        System.out.println(obj8.getObject());//Java here we used object.functionname

        TestingGenerics<Double> obj9= new TestingGenerics<>(3.528);
        System.out.println(obj9.getObject());//3.528 here we used object.functionname

        int b = 100;  //stored in stack
        // write your code here
        String str1 = "Hello";//here str1 and str2 are objects as well as local variables
        String str2 = "hello"; //hello will not be placed in inside stack memory because they are objects
//        //accessor methods
//        for (int i = 0; i < str1.length(); i++) {
////            System.out.println(str1[i]); //error array required bust it is a string or object
//            System.out.println(str1.charAt(i));// H   e  l  l  o   at each line each character
//        }
        //---------

//        if(str1.equals(str2)){ //strings are immutable
//                System.out.println("yes they are same");
//        }else {
//                System.out.println("not same");
//        }
        //----------
//        String str3 =str1.concat(str2);//for objects means strings don't use double equal (==) it's only useful in premitive datatypes
//        System.out.println(str3);
//
        //----------
//        System.out.println(str1.replace('H','K')); //Kello
//        System.out.println(str1);//Hello  this is immutable because it's a string
//
        //---------
//        System.out.println(str1.substring(2));//from first l of hello and till the end of string it will print
//
        //----------

//        System.out.println(str1.indexOf('q',0));//4  from index 0 it checks the immediate  character 'o' here and returns it's index if not found then returns -1

        //java collection framework-classes and interfaces  reusable collection of data structures
        //java.util.Collection -interface collection , java.util.Map - Map interface
         //in java collection there is no use of primitive data types
        //Wrapper classes  , every primitive data type have it's own wrapper class
//        Integer a = new Integer(10);
//        System.out.println(a);//10

        //---------
        //mainly ArrayList is used for dynamic purposes it can change it's size dynamically
        //create an object for ArrayList
        //className objName = new Constructor();
        //need a class not a ordinary  i make use of wrapper class instead of using primitive data type ,if  you want to use wrapper class so must use generic <>
//        ArrayList<Integer> obj1 = new ArrayList<>(3); //we created arraylist constructor of type integer
//        obj1.add(3);
//        obj1.add(4);
//        obj1.add(5);
//        System.out.println(obj1); // [3,4,5] ArrayList is a part of list so  output is in list
//        obj1.add(6);
//        obj1.add(7);//Run time complexity in Java collection is bigo of 1 or O(1)
//
//        System.out.println(obj1); //[3,4,5,6,7] //here initial capacity doubles so 3*2 =6 so is current capacity
//        obj1.remove(2);//removes element at index 2
//        System.out.println(obj1);  //[3,4,6,7] here 5 is deleted because 5 is at index 2
//
//        //coping data from one ArrayList to another ArrayList is possible
//        ArrayList<Integer> obj2 =new ArrayList<>();
//
//        obj2.addAll(obj1);
//        System.out.println(obj2.clone()); //same as obj2 array  [3,4,6,7]
//        System.out.println(obj2); //[3,4,6,7]
//
//        if(obj2.contains(3)){
//            System.out.println("yes available"); //if 5 is in ArrayList obj2  then it's available
//        }else {
//            System.out.println("Not Available");  //else not AVAILABLE
//        }
//        System.out.println(obj2.removeAll(obj1)); //   delete all obj1 data from obj2
//        System.out.println(obj2); //obj2 consists only obj1 data so obj2 is also empty
//        System.out.println(obj1); //obj1 data exists [3,4,6,7]

        //--------
//        ArrayList<String> obj3= new ArrayList<>(); //generic -applicable for any data type
//        obj3.add("Apple");  //ArrayList is a generic data type
//        obj3.add("coconut");
//        obj3.add("mango");
//        System.out.println(obj3); //[Apple,coconut,mango]

    }
}
