package com.example;

public class Product {

    // Atributos
    private String id;
    private String name;
    private double price;
    private int stock;

    // Constructor por defecto
    public Product() {
        this.id = "000";
        this.name = "Sin nombre";
        this.price = 0.0;
        this.stock = 0;
    }

    // Constructor parametrizado
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {

        // Validación opcional
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {

        // Validación opcional
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto [ID: " + id +
                ", Nombre: " + name +
                ", Precio: " + price +
                ", Stock: " + stock + "]";
    }
}

