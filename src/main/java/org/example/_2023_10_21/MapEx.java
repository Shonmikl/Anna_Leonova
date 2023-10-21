package org.example._2023_10_21;

import java.util.*;

public class MapEx {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(RANDOM.nextInt(50), RANDOM.nextInt(50));
        }

        System.out.println(map1);

        Set<Map.Entry<Integer, Integer>> room = map1.entrySet();

        for (Map.Entry<Integer, Integer> box : room) {
            if(box.getKey() > box.getValue()) {
                System.out.println(box);
            }
        }

        /**
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         * Коробка<Кружок, Квадрат> КК
         *
         * Комната<Коробка>
         *
         *
         *
         */

    }
}

class Country {
    City city;
}

class City {
    Street street;
}

class Street {
    int s;

}