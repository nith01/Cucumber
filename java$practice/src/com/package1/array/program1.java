package com.package1.array;

public class program1 {

    //Write a Java Program to reverse a string without using String inbuilt function.
// "hello" to "olleh"
    public static StringBuffer reverseMethod(String word) {
        StringBuffer str = new StringBuffer();

        str.append(word);
        str.reverse();
        return str;
    }

    public static void main(String[] args) {

        StringBuffer str1 = reverseMethod("hello");
        StringBuffer str2 = reverseMethod("every");
        StringBuffer str3 = reverseMethod("one");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
