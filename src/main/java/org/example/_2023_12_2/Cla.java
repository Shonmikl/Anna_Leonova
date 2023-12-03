package org.example._2023_12_2;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cla {
    public Set<Point> getCommon(Point sq1, Point sq2) {
        Set<Point> sq1POINTS;
        Set<Point> sq2POINTS;

        sq1POINTS = get9points(sq1);
        sq2POINTS = get9points(sq2);
        sq1POINTS.retainAll(sq2POINTS);

        return sq1POINTS;

    }

    /**
     * x y
     * x 2
     */
    private Set<Point> get9points(Point sq1) {
        Set<Point> sq = new HashSet<>();

        for (double x = sq1.getX() - 1; x < 3; x++) {
            for (double y = sq1.getY() - 1; y < 3; y++) {
                sq.add(new Point((int) x, (int) y));
            }
        }
        return sq;
    }

    public static void main(String[] args) {
        System.out.println(new Cla().getCommon(new Point(2, 2), new Point(3, 3)));
    }
}