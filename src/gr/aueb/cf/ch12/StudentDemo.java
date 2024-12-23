package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student(); // INVOKED DEFAULT CONSTRUCTOR
        Student bob = new Student(2, "Bob", "Ross"); // INVOKE OVERLOAD CONSTRUCTOR

         student.setId(1);                      //        student.id = 1;
         student.setFirstname("Alice");         //        student.firstName = "Alice";
         student.setLastname("W.");             //        student.lastName = "W.";

        System.out.println("ID: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Students count : " + Student.getStudentsCount());
    }
}
