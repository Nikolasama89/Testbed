package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products1 = List.of(new Product("", 12.5, 10),     // Immutable List
                new Product("", 12.5, 10));

        List<Product> products2 = Arrays.asList(new Product("", 12.5, 10),    // Partially Immutable List
                new Product("", 12.5, 10));

        List<Product> products3 = new ArrayList<>(List.of(new Product("Apples", 12.5, 30),     // Mutable List
                new Product("Oranges", 12.5, 15), new Product("Berries", 12.5, 10),
                new Product("Lemons", 42.5, 20)
                ));

        products3.sort(Comparator.naturalOrder());  // Sort based on Comparable
        products3.sort(Comparator.reverseOrder());  // Based on Comparable

        products3.sort(Comparator.comparing(Product::getName));
        products3.sort(Comparator
                .comparing(Product::getName)
                .thenComparing(Product::getQuantity)
                .thenComparing(Product::getPrice).reversed());

        products3.forEach(System.out::println);
    }

}
