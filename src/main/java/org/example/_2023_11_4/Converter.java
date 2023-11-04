package org.example._2023_11_4;

public class Converter {
    public static double convertToUSD(double moneyAmount, Currency from) {
        double sum = 0.0;
        if(from == Currency.RUR) {
            sum = moneyAmount / 95;
        }

        return sum;
    }

}
