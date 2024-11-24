package gr.aueb.cf.ch2;

/**
 * Count steps ups, distance down by 1
 */

public class CounterApp {

    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, Distance: %d\n", steps, distance);
    }
}
