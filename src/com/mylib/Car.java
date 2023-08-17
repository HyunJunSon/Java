package com.mylib;

public class Car {
    String name;
    String color;
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setModel(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void view() {
        System.out.println("모델:" + name + " 색상:" + color);
    }
}
