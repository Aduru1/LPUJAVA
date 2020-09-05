package com.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here  // float gives 6 digits after decimal and double gives
//        double num = 100/3F ; //telling compiler that you need decimal part also
//        System.out.println(num);
//        int[] arr={1,2,3,4,5,6}; //array initialization
//        System.out.println(arr[6]); //4 which is at index 3 //exception Index out of bounds
        int size; //declared byuser
        System.out.print("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        size =sc.nextInt(); //stores size ,it is size of an array
        // util is a package , scanner is a class ,nextInt is a method
        //creating an array of the size
        //int[] arr=new int[10];
        int[] arr=new int[size];

        //ask my user to insert elements in  array
        System.out.println("enter the value of the array");
        for(int i=0;i<size;i++){
            System.out.print("Enter the value at index"+ i +" :");
            arr[i] = sc.nextInt();
        }
        //print values of array
        System.out.println("\nThe values of array  is:");
        for(int i=0;i<size;i++){
            System.out.println("Element at index"+ i +" is:"+arr[i]);

        }
    }
}
