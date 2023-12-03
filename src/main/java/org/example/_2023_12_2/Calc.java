package org.example._2023_12_2;

public class Calc {
    public static double div(int a, int b) throws DivideByZeroException{
        return a / b;
    }

    public static double test(int a, int b) throws Exception {
        return a * b;
    }


    public static void main(String[] args) {
        try {
            div(5, 0);
            test(2, 0);
        } catch (Exception e) {
            System.out.println("DivideByZeroException e");;
        }
    }
}
