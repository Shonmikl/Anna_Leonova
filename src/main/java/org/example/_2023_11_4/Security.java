package org.example._2023_11_4;

import java.util.ArrayList;
import java.util.List;

public enum Security {
    HIGH,
    MEDIUM,
    LOW;
}

class Empl {
    String name;
    Department department;
    Security security;

    public Empl(String name, Department department, Security security) {
        this.name = name;
        this.department = department;
        this.security = security;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Security getSecurity() {
        return security;
    }
}

enum Department {
    HR,
    FINANCE,
    SALES,
    IT;
}

class Main {
    public static void main(String[] args) {
        Empl e1 = new Empl("Nik", Department.IT, Security.MEDIUM);
        List<Empl> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).security == Security.HIGH) {
                //accept();
            }
        }

    }
}
