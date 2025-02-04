package gr.aueb.cf.ch19.sorting;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + quantity;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.quantity;
//    }

//    @Override
//    public int compareTo(Product o) {
//        return Double.compare(this.price, o.price);
//    }
}
