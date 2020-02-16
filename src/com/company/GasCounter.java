package com.company;

public class GasCounter {

    private int maxCost;
    private int distanseFitt;
    private String name;

    private String model;
    private int size;

    private static int price;

    protected String material;
    protected String color;


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    public int getDistanseFitt() {
        return distanseFitt;
    }

    public void setDistanseFitt(int distanseFitt) {
        this.distanseFitt = distanseFitt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        GasCounter.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public GasCounter() {
    }

    public GasCounter(int maxCost, int distanseFitt, String name, String model, int size, String material, String color) {
        this.maxCost = maxCost;
        this.distanseFitt = distanseFitt;
        this.name = name;
        this.model = model;
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public GasCounter(int maxCost, int distanseFitt, String name, String model, int size) {
        this(maxCost, distanseFitt, name, model, size, "", "");

    }


    public static void printStaticPrice() {
        System.out.println("Ціна лічильника: ");
    }

    public void printPrice() {
        System.out.println(price);
    }

    public void resetValues(int maxCost, int distanseFitt, String name, String model, int size, String material, String color) {
        this.maxCost = maxCost;
        this.distanseFitt = distanseFitt;
        this.name = name;
        this.model = model;
        this.size = size;
        this.material = material;
        this.color = color;
    }


    @Override
    public String toString() {
        return "gasCounter{" +
                "maxCost=" + maxCost +
                ", distanseFitt=" + distanseFitt +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



