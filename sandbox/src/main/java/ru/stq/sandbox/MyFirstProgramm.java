package ru.stq.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        String somebody = "world";
        System.out.println("Hello," + somebody+" !");
        double a = 5;
        System.out.println("size of square is " + area (a) + ".");
    }
    public static double area(double a){
        double s = a*a;
        return s;
    }
}
