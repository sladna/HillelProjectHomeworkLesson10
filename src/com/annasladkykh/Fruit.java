package com.annasladkykh;

public class Fruit {

    public enum Type {
        APPLE, LEMON, BANANA
    }

    private Type type;
    private Color color;
    private int weight; // вес в граммах
    private double price; // цена за кг

    public double calculatePrice() {
        double result = price * weight / 1000;
        return Util.round(result);
    }

    public Fruit(Type type, Color color, int weight, double price) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}