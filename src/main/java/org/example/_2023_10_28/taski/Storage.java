package org.example._2023_10_28.taski;

/**
 * Требования:
 *
 * Параметризуйте класс Storage.
 * Добавьте метод getLast, который возвращает
 * последний добавленный элемент без удаления
 * его из хранилища.
 */
class Storage {
    private Object[] items;
    private int count = 0;

    public Storage(int size) {
        items = new Object[size];
    }

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}
