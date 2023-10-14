package org.example._2023_10_07;

import java.util.*;

/**
 * Comparable - в сигнатуре класса
 * Comparator
 */
public class Cat implements Comparable<Cat> {
    int age;
    String name;

    Color color;

    public Cat(int age, String name, Color color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.color.compareTo(o.color);
    }

    public static void main(String[] args) {
        List<Cat> catSet = new ArrayList<>();
        catSet.add(new Cat(12, "L", Color.BLACK));
        catSet.add(new Cat(5, "FTL", Color.WHITE));
        catSet.add(new Cat(2, "R", Color.RED));
        catSet.add(new Cat(9, "R", Color.BLACK));

        Collections.sort(catSet, new CatAgeComparator());

        System.out.println(catSet);
    }
}

enum Color {
    RED, WHITE, BLACK
}

class CatAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}