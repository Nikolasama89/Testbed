package gr.aueb.cf.ch14;

public class Employee extends Person{
    private double salary;

    public Employee() {

    }

    public Employee(long id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Gets a salary.");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Speaks a lot");
    }
}
