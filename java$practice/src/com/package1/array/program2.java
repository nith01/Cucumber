package com.package1.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program2 {
    //Take 10 integer inputs from user and store them in an array and print them on screen
    //Now enter a number and check if that number is present in array
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int[] x = new int[10];
        boolean present = true;
        ;
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("value of x[" + i + "] is:" + x[i]);
        }
        System.out.println("Please enter the number you want to check");
        int number = in.nextInt();
        for (int i : x)
            if (i != number) {
                present = false;
            }
            else present = true;
            System.out.println(number + " is " + present);


    }
}


