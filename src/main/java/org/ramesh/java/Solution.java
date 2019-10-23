package org.ramesh.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int sec_i;
        double sec_d;
        String sec_s ;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
//        sec_s=scan.nextLine();
        sec_i=scan.nextInt();
        sec_d=scan.nextDouble();

        sec_s=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+sec_i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+sec_d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+ " " + sec_s);
        System.out.println("*************** ");

        scan.close();
    }
}