package org.example._2023_11_11;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    List<Integer> list = new ArrayList<>();
}

class Main {
    public static void main(String[] args) {
        new Memory().list.add(0);
        new Memory().list.add(1);
        new Memory().list.add(1);
        new Memory().list.add(1);
        new Memory().list.add(0);
        new Memory().list.add(0);
        new Memory().list.add(0);
        new Memory().list.add(0);


    }
}

class Java {
    private Memory memory;
    public Java() {
        this.memory = new Memory();
    }


}
