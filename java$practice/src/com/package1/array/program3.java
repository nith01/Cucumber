package com.package1.array;

import java.util.Scanner;

public class program3 {
    //Take 10 integer inputs from user and store them in an array.
    // Now, copy all the elements in an another array but in reverse order.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr1 = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        for (int i = 0; i < arr.length; i++)
            System.out.println("value of x[" + i + "] is:" + arr[i]);
        System.out.println("==================================================================");
        System.out.println("Reverse order of array");

        int j = 0;
        for (int i = 9; i>=0; i--) {
            arr1[i] = arr[j];
            j++;
        }
        for (int i = 0; i < arr1.length; i++)
            System.out.println("value of x[" + i + "] is:" + arr1[i]);
    }
}