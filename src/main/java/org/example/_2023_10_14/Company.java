package org.example._2023_10_14;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    Department department;

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

class Department {
    List<Em> list;

    public List<Em> getList() {
        return list;
    }
}

class Em {
    double salary;

    public double getSalary() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        for (int i = 0; i < companies.size(); i++) {
           double d = companies.get(i).getDepartment().getList().get(i).getSalary();
        }
    }
}