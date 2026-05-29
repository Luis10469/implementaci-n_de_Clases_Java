package com.example;

public class App {

    public static void main(String[] args) {

        // Objeto con constructor por defecto
        Product product1 = new Product();

        // Objeto con constructor parametrizado
        Product product2 = new Product("P123", "Laptop", 2500.0, 10);

        // Uso de setters
        product1.setId("P001");
        product1.setName("Mouse");
        product1.setPrice(50.0);
        product1.setStock(20);

        product2.setPrice(2400.0);

        // Uso de getters
        System.out.println("Nombre del producto 1: " + product1.getName());
        System.out.println("Precio del producto 2: " + product2.getPrice());

        // Uso de toString()
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
