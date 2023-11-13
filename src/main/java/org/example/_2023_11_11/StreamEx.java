//package org.example._2023_11_11;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//public class StreamEx implements Predicate {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new Random().nextInt(555));
//        }
//
//        List<String> list1 = list.stream()
//                .map(el -> el * 10)
//                .filter(el -> el < 0)
//
//
//    }
//
//    @Override
//    public boolean test(Object o) {
//        Integer i = (Integer) o;
//        if (i > 100) {
//            return i % 2 == 0;
//        } else if (i < 0) {
//            return i % 3 == 0;
//        }
//        return (Integer) o % 5 == 0;
//    }
//}
