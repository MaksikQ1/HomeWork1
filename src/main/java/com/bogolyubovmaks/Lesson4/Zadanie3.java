package com.bogolyubovmaks.Lesson4;

import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " (Цена: " + price + ", Рейтинг: " + rating + ")";
    }
}

public class Zadanie3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Ноутбук", 999.99, 4.5));
        products.add(new Product("Телефон", 699.99, 4.2));
        products.add(new Product("Монитор", 199.99, 3.5));
        products.add(new Product("Клавиатура", 49.99, 3.0));

        Product maxPriceProduct = products.get(0);
        Product minPriceProduct = products.get(0);

        for (Product product : products) {
            if (product.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
            if (product.getPrice() < minPriceProduct.getPrice()) {
                minPriceProduct = product;
            }
        }

        System.out.println("Товар с максимальной ценой: " + maxPriceProduct);
        System.out.println("Товар с минимальной ценой: " + minPriceProduct);

        for (int i = products.size() - 1; i >= 0; i--) {
            if (products.get(i).getRating() < 3.0) {
                products.remove(i);
            }
        }

        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getName().compareTo(products.get(j).getName()) > 0) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }

        System.out.println("\nСписок товаров в алфавитном порядке:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}