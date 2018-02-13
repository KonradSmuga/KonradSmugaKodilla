package com.kodilla.good.patterns.challenges.food2door;

public class Provider {
    private String name;
    private String productType;
    private int quantity;

    public Provider(String name, String productType, int quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", productType='" + productType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
