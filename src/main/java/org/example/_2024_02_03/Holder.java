package org.example._2024_02_03;

import java.util.ArrayList;
import java.util.List;

public class Holder {
    private List<String> list;

    public Holder() {
        this.list = new ArrayList<>();
    }

    public List<String> getList() {
        return list;
    }

    public void addToList(String el) {
        list.add(el);
    }

    public void modifyList() {
        list.replaceAll(s -> s + "!");
    }
}
