package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Oranges", 8.5, 80),
                new Product("Mangoes", 18.5, 50),
                new Product("Strawberries", 12.4, 30));

        ArrayList<String> listOfFruits = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        // Summing quantities
        int totalQuantities = products.stream()
                .filter(product -> product.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();

        // summing Prices
        double totalPrice = products.stream()
                .filter(product -> product.getName().equals("Oranges"))
                .mapToDouble(Product::getPrice)
                .sum();


    }
}
