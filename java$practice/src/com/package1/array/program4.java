package com.package1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program4 {
    //How do I read an input array when the size is not known?
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Input read in str[] array with no size defined

        String str[] = br.readLine().split(" ");

        int N = str.length; //N stores number of values

        System.out.println("Size of array is " + N);

    }
}
