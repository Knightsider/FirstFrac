package com.company;
import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Frac f = new Frac(1,2);
        Frac f1 = new Frac(3,4);
        System.out.println(f.toString());
        System.out.println(f.sum(f1));
        System.out.println(f.sum(3));
        System.out.println(f.mult(f1));
        System.out.println(f.mult(3));
        System.out.println(f.div(2));
        System.out.println(f.div(f1));
        System.out.println(f.inverse());
        System.out.println(f.isDenominatorZero());
        System.out.println(f.shortFrac());
        System.out.println(f.isShorten());
        System.out.println(f.isEqual(f1));
        System.out.println(f.compareTo(f1));
        }
    }
