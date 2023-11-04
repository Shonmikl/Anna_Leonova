package org.example._2023_10_28.taski;

/**
 * Требования:
 *
 * Параметризуйте класс Comparator так, чтобы
 * он мог сравнивать только объекты класса Book или
 * его подклассы.
 * Добавьте в класс Book поле author и методы для его
 * получения и установки. Расширьте класс Comparator,
 * чтобы он мог сравнивать книги по авторам, если названия
 * одинаковы.
 */
class Comparator {
    public int compare(Object a, Object b) {
        return a.toString().compareTo(b.toString());
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}