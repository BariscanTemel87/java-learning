package com.java.SingeltonAndBuilder;

/*
 * Singleton ve Builder Tasarım Desenleri
 */
public class Main {
    public static void main(String[] args) {
        // Singleton kullanımı
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder kullanımı
        Product product = new Product.ProductBuilder()
                .builder("Laptop", 5000)
                .setDescription("16 GB RAM, 1 TB SSD, 4 GB Ekran Kartı")
                .setQuantity(10)
                .build();

        System.out.println(product);
    }
}

