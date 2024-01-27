package org.example._2024_01_27;

public class T1 {
    public double get(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(new T1().get(1, 0));
    }
}