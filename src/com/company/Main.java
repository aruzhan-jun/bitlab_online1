package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        //short a = 100;
        //short b = 200;
        //System.out.println(a + b);

        //2
        //Scanner in = new Scanner(System.in);
        //double a = in.nextDouble();
        //double b = in.nextDouble();
        //System.out.println(a*b);

        //3
        //Scanner in = new Scanner(System.in);
        //System.out.println("In what university do you study?");
        //String university = in.next();
        //System.out.println("What faculty do you study?");
        //String faculty = in.next();
        //System.out.println("What subject do you study?");
        //String subject = in.next();
        //System.out.println("University: " + university);
        //System.out.println("Faculty: " + faculty);
        //System.out.println("Subject: " + subject);

        //4
        //Scanner in = new Scanner(System.in);
        //double a = in.nextDouble();
        //double b = in.nextDouble();
        //double c = in.nextDouble();
        //boolean d = (a+b)>c;
        //System.out.println(d);

        //5
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double x4 = Math.pow(x, 4);
        double y = in.nextDouble();
        double z = in.nextDouble();
        double z4 = Math.pow(z, 4);
        System.out.println(x4 + 4*x*y*y - 4*y*z + z4);
    }
}
