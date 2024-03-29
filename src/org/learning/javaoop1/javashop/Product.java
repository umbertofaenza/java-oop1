package org.learning.javaoop1.javashop;

import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private double tax;

    public Product(String name, String description, double price, double tax) {
        this.code = this.genCode();

        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getTaxedPrice() {
        return this.price + (this.price * (this.tax / 100));
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCodeName() {
        String formattedCode = String.format("%08d", this.code);

        return formattedCode + "-" + this.name;
    }

    private int genCode() {
        Random randGen = new Random();
        return code = (randGen.nextInt(99999999));
    }
}
