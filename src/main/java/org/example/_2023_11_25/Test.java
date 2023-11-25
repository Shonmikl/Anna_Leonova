package org.example._2023_11_25;

public class Test {
//    static int a(int a) {
//        return a * 10;
//    }
//
//    static int b(int b) {
//        return b * 100;
//    }

    public static void main(String[] args) {
        m(Test::r);

    }

    public static void m(Inter inter) {
        inter.get();
    }

    public static void r() {
        System.out.println("@@@@@@@");
    }
}

@FunctionalInterface
interface Inter {

    void get();

    int hashCode();
}