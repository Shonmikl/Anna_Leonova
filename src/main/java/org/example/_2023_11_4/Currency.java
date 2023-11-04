package org.example._2023_11_4;

public enum Currency {
    USD {
        @Override
        double index() {
            return 1.23d;
        }
    },
    RUR {
        @Override
        double index() {
            return 1.33d;
        }
    },
    EUR {
        @Override
        double index() {
            return 1.26d;
        }
    },
    CHY {
        @Override
        double index() {
            return 1.73d;
        }
    };

    abstract double index();
}

class BankAccount {
    Currency currency;

    public BankAccount(Currency currency) {
        this.currency = currency;
    }
}
