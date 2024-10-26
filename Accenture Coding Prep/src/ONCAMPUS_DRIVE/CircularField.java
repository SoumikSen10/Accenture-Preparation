package ONCAMPUS_DRIVE;

/*

You are working on a project where you need to calculate the area of a circular field for different lengths of the radius. T

However, for practical purposes, the area must always be rounded down to the nearest whole number since the result needs to represent an integer value in square meters.

Write a program that takes different values of 𝑙 (the radius) as input and returns the integer value of D (the area) by truncating the decimal part.



*/

import java.util.Scanner;

public class CircularField
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int d = (int)Math.floor(3.14 * l * l);
        System.out.println(d);
    }
}
