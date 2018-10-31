package com.example;

public class Shirt {

    private String number;
    private String model;
    private String color;
    private String size;

    public Shirt(String number, String model, String color, String size) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt number " + number + ", model " + model + ", color " + color + ", size " + size;
    }
}
