package org.example._2023_09_30.classes.huaweiEx;

public class Linkk {
    Linkk linkk;
    String linksName;
    String path;

    public Linkk(String linksName, String path) {
        this.linksName = linksName;
        this.path = path;
    }

    public static void main(String[] args) {
        Linkk l1 = new Linkk("Акции", "https://shop2-spb.pitersmoke.ru/aktsii/");
        Linkk l2 = new Linkk("Доставка", "https://shop2-spb.pitersmoke.ru/dostavka/");

    }
}
