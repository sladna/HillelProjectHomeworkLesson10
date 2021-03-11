package com.annasladkykh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine();
        cashMachine.addFruit(new Fruit(Fruit.Type.APPLE, Color.GREEN, 186, 25.90));
        cashMachine.addFruit(new Fruit(Fruit.Type.APPLE, Color.RED, 146,26.90));
        cashMachine.addFruit(new Fruit(Fruit.Type.BANANA, Color.YELLOW, 186, 32.80));
        cashMachine.addFruit(new Fruit(Fruit.Type.LEMON, Color.YELLOW, 246, 34.90));

        System.out.println("Price for 4 fruits " + cashMachine.calculateBill());

    }
}