package com.webappcraft.examples.valleys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program is solving the Counting Valleys problem");
        System.out.print("Please specify the path: ");
        Scanner lr = new Scanner(System.in); String p = lr.nextLine(); Integer v = exec(p);
        System.out.println("Number of valleys is equal to " + v);
    }

    static Integer exec(String x) {
        Integer l=0,v=0;
        for(int i=0;i<x.length();i++) {
            if (x.charAt(i) == 'D') {
                if (l==0) { v++; }
                l--;
            } else if (x.charAt(i) == 'U') {
                l++;
            }
        }
        return v;
    }

}
