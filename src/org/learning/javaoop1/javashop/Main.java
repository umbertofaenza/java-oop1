package org.learning.javaoop1.javashop;

public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product("Rubber Duck",
                "A rubber duck helping programmers with coding.",
                10.00, 22);

        System.out.println("CodeName: " + prod1.getCodeName());
        System.out.println("Description: " + prod1.getDescription());
        System.out.println("Code: " + prod1.getCode());
        System.out.println("Base Price: " + prod1.getBasePrice());
        System.out.println("Price with taxes: " + prod1.getTaxedPrice());

        Product prod2 = new Product("Glass",
                "A tall glass that works for water, soft-drinks and cocktails alike.",
                8.00, 10);

        System.out.println("CodeName: " + prod2.getCodeName());
        System.out.println("Description: " + prod2.getDescription());
        System.out.println("Code: " + prod2.getCode());
        System.out.println("Base Price: " + prod2.getBasePrice());
        System.out.println("Price with taxes: " + prod2.getTaxedPrice());
    }
}

