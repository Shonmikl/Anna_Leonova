package org.example._2023_10_28.taski;

/**
 *
 * Требования:
 *
 * Параметризуйте класс FoodProcessor так, чтобы он
 * мог кормить только объекты класса Animal и его
 * подклассы.
 * Добавьте логику в метод feed, чтобы он выводил
 * сообщение вида: "[животное] съело: [что-то вкусное]",
 * используя метод eat из класса Animal.
 */
class FoodProcessor {
    public void feed(Object animal) {
        System.out.println("Покормили " + animal.toString());
    }
}

class Animal {
    public String eat() {
        return "ом-ном-ном";
    }
}
class Cat extends Animal { }
class Dog extends Animal { }
