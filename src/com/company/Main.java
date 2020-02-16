package com.company;

import java.lang.String;

public class Main {

    public static void main(String[] args) {
        GasCounter gasFirst = new GasCounter();
        GasCounter gasSecond = new GasCounter(3, 8, "Sheft", "H-LIGHT", 10, "Iron", "Black");
        GasCounter gasThird = new GasCounter(2, 4, "Sors", "H-PRO", 15);

        System.out.println(gasFirst.toString());
        System.out.println(gasSecond.toString());
        System.out.println(gasThird.toString());


        GasCounter[] gasCountersArray = new GasCounter[4];
        for (int i = 0; i < 4; i++) {
            gasCountersArray[i] = new GasCounter();
        }

        for (GasCounter y : gasCountersArray) {
            System.out.println(y.toString());
        }
    }
}
