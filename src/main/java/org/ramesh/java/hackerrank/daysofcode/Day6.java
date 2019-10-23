package org.ramesh.java.hackerrank.daysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        List<String> arrStr=new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int t=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<t;i++){
            arrStr.add(scan.nextLine());
        }
        for(String s:arrStr){
            printString(s);
        }

    }
    public static  void printString(String str){
        String odd="";
        String even="";
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if((i%2)==0)
                even+=c[i];
            else
                odd+=c[i];
        }
        System.out.println(even + " " + odd);
    }

}
