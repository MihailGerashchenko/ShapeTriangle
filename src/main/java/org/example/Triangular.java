package org.example;

import java.util.Objects;

public class Triangular extends Shape {

    private Point a;
    private Point b;
    private Point c;

    private double ab;
    private double bc;
    private double ca;

    private double p;
    private double s;

    public Triangular(Point a, Point b, Point c) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Objects.requireNonNull(c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular(double oneTopX, double oneTopY,
                      double twoLeftX, double twoLeftY,
                      double threeRightX, double threeRightY) {
        this.a = new Point(oneTopX, oneTopY);
        this.b = new Point(twoLeftX, twoLeftY);
        this.c = new Point(threeRightX, threeRightY);
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    @Override
    public double square() {
        s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        return s;
    }

    @Override
    public double perimeter() {
        ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) +
                Math.pow(a.getY() - b.getY(), 2));
        bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) +
                Math.pow(b.getY() - c.getY(), 2));
        ca = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) +
                Math.pow(c.getY() - a.getY(), 2));
        p = 0.5 * (ab + bc + ca);
        return p;
    }

    @Override
    public void move(double dx, double dy) {
        a.setX(a.getX() + dx);
        a.setY(a.getY() + dy);
        b.setX(b.getX() + dx);
        b.setY(b.getY() + dy);
        c.setX(c.getX() + dx);
        c.setY(c.getY() + dy);
    }

    @Override
    public String toString() {
        return "Triangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                super.toString() + '}';
    }
}
