package com.annasladkykh;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private final List<Fruit> list = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        list.add(fruit);
    }

    public double calculateBill() {
        double result = 0;
        for (Fruit fruit : list) {
            result += fruit.calculatePrice();
        }
        return Util.round(result);
    }
}