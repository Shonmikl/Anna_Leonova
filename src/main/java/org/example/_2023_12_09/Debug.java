package org.example._2023_12_09;

public class Debug {
    public static int getSum(int a, int b) {
        int t = checkANDupdate(a, b);
        return t + b;
    }

    private static int checkANDupdate(int a, int b) {
        return a + a * 2 + b + b + 111;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(getSum(a, b));
    }
}
