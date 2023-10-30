package org.example._2023_10_28.taski;

/**
 * Требования:
 *
 * Параметризуйте класс Box так, чтобы он мог хранить
 * только объекты класса Fruit и его подклассы.
 * Добавьте метод getJuice, который принимает объект
 * класса Box и вызывает метод juice, если содержимое
 * является фруктом.
 */
class Box {
    private Object item;

    public Box(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

class Fruit {
    public void juice() {
        System.out.println("Сок");
    }
}
class Apple extends Fruit { }
class Orange extends Fruit { }
