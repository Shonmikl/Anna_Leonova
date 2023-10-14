package org.example._2023_09_30.staticNONstatic;

public class OrderI {
    public boolean accept(OrderI orderI) {
        if(orderI != null) {
            saveTimeOnSite();
            return true;
        }
        return false;
    }

    private static void saveTimeOnSite() {
    }
}
