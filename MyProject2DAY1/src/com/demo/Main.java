package com.demo;

public class Main {
    //string is in java.lang package it is default package
    //string[] args  helps us  to use  command line arguments
    // main is the first method which will run inside stack
    public static void main(String[] args) {
	//in java, string is not a primitive data type here string is treated as object
        //java is not complete oop's like data types
        //strings are completly oop's
        //name is a object  ->which has some methods to execute
        String name="Java";  //here string is  a primitive data type
//        String name1 = new String("Programming"); //here string is a class
//        System.out.println(name + name1);
        //if you want to go at specific index
        System.out.println(name.charAt(2)); //J if it is 10 instead of 0 then exception string index out of bound

        //find length of string
        System.out.println("the length is:" +name.length());//4  because java is of  4 characters

        char[] str={'J','a','v','a'}; //character pool concatenation
            System.out.println(str); //character pool can get access to methods
            //string is immutable once it is created a string object cannot be changed

//        for(int i=0;i<args.length;i++){  // provide arguments in edit configurations
//            System.out.println(args[i]);  //for command line arguments
//        }
    }
}
