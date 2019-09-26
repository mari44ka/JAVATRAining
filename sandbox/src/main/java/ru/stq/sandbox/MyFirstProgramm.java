package ru.stq.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        String somebody = "world";
        System.out.println("Hello," + somebody+" !");
        double a = 5;
        Square s = new Square(5);
        System.out.println("size of square with side " + s.l +" is " + s.area () + ".");
        Triangle t = new Triangle(4,5);
        System.out.println("size of triangle with side " + t.a + " and "+ t.b +" is " + t.area () + ".");
    }




}
