package org.example._2023_10_28;

import java.util.ArrayList;
import java.util.List;

public class Gex2 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("S");

        System.out.println((String) objects.get(0));
    }
}

class Animal {}
class HomeAnimal extends Animal {}
class WildAnimal extends Animal {}
class Dog extends HomeAnimal {}
class Wolf extends WildAnimal {}
class ChaoChao extends Dog {}


class MyAnimal<T extends Animal> {
    public static void main(String[] args) {
        MyAnimal<WildAnimal> stringMyAnimal = new MyAnimal<>();
        List<Integer> list = List.of(1, 4);
        list.add(99);
     }
}
