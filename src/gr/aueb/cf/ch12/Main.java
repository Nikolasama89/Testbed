package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Nick", "Mich");
        User user = new User(1, "Costas", "Musk", "cmask", "124533", true);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "13242435353", "5353535353", "Attica", "Athens", "Athens","Patission", "76","10434");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + " " + teacher.getLastname());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Customer VAT: " + customer.getVatRegistrationNo());
        System.out.println("Order Timestamp: " + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d}\n", point.getX(), point.getY());
    }
}
