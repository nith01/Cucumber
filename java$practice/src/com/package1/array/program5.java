package com.package1.array;

import java.util.Scanner;

public class program5 {
    //Find largest and smallest elements of an array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > largest)
                largest = arr[i];

            if (arr[i] < smallest)
                smallest = arr[i];

        }
            System.out.println("Largest number is "+largest+" Smallest number is "+smallest);


    }
}
