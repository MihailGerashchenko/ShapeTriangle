package org.example;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Triangular(new Point(3,4), new Point(5, 12), new Point(8,4));
        System.out.println(shape);
    }
}
