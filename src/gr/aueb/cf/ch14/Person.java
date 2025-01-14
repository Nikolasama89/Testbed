package gr.aueb.cf.ch14;

public class Person {
    private long id;
    private String firstName;
    private String lastName;

    // Default Constructor
    public Person() {

    }

    //Overloaded Constructor
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void work() {
        System.out.println("Doing some work.");
    }

    public void speak() {
        System.out.println("Says something.");
    }
}
