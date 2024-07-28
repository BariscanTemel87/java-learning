package com.java.SingeltonAndBuilder;

/*
 * Singleton ve Builder Tasarım Desenleri
 */
public class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.quantity = builder.quantity;
    }

    public static ProductBuilder ProductBuilder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String name;
        private double price;
        private String description;
        private int quantity;

        public ProductBuilder builder(String name, double price) {
            this.name = name;
            this.price = price;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}